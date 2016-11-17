package com.deepnoodle.metro.service;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.http.client.ClientProtocolException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepnoodle.metro.dao.AgencyDao;
import com.deepnoodle.metro.dao.RouteDao;
import com.deepnoodle.metro.dao.RouteStopDao;
import com.deepnoodle.metro.dao.TripStatusDao;
import com.deepnoodle.metro.dao.VehicleStatusDao;
import com.deepnoodle.metro.fetcher.StopsForRouteFetcher;
import com.deepnoodle.metro.fetcher.VehiclesForAgencyFetcher;
import com.deepnoodle.metro.model.Agency;
import com.deepnoodle.metro.model.Route;
import com.deepnoodle.metro.model.RouteStop;
import com.deepnoodle.metro.model.StopGroup;
import com.deepnoodle.metro.model.StopGrouping;
import com.deepnoodle.metro.model.StopsForRoute;
import com.deepnoodle.metro.model.TripStatus;
import com.deepnoodle.metro.model.VehicleStatus;
import com.deepnoodle.metro.model.VehiclesForAgency;

@Service
public class MetroService implements IsService {

	private static final Logger log = LogManager.getLogger(MetroService.class);

	@Autowired
	private VehiclesForAgencyFetcher vehiclesForAgencyFetcher;

	@Autowired
	private StopsForRouteFetcher stopsForRouteFetcher;

	@Autowired
	private VehicleStatusDao vehicleStatusDao;

	@Autowired
	private AgencyDao agencyDao;

	@Autowired
	private RouteDao routeDao;

	@Autowired
	private RouteStopDao routeStopDao;

	@Autowired
	private TripStatusDao tripStatusDao;

	public void fetchAndSave(boolean saveVehicleStatus, boolean saveAgency, boolean saveRoute,
			boolean saveStopsForRoute)
			throws ClientProtocolException, IOException {
		VehiclesForAgency vehiclesForAgencyResult = vehiclesForAgencyFetcher.fetch();

		for (VehicleStatus vehicleStatus : vehiclesForAgencyResult.getData().getList()) {
			if (saveVehicleStatus) {
				vehicleStatusDao.saveOrUpdate(vehicleStatus);
			}
			TripStatus tripStatus = vehicleStatus.getTripStatus();
			if (tripStatus != null
					&& tripStatus.getPredicted()
					&& tripStatus.getClosestStopTimeOffset() > -60
					&& tripStatus.getClosestStopTimeOffset() < 60) {
				TripStatus lastTripStatus = tripStatusDao.getLast(tripStatus.getActiveTripId());
				if (lastTripStatus == null || (!tripStatus.getClosestStop().equals(lastTripStatus.getClosestStop()))) {
					tripStatusDao.save(tripStatus);
					log.info("saved");
				} else if (Math.abs(tripStatus.getClosestStopTimeOffset()) < Math
						.abs(lastTripStatus.getClosestStopTimeOffset())) {
					tripStatusDao.delete(lastTripStatus);
					tripStatusDao.save(tripStatus);
					log.info("replaced");
				} else {
					log.debug("already saved");
				}
			}
		}
		if (saveAgency) {
			for (Agency agency : vehiclesForAgencyResult.getData().getReferences().getAgencies()) {
				agencyDao.saveOrUpdate(agency);
			}
		}
		if (saveRoute) {
			for (Route route : vehiclesForAgencyResult.getData().getReferences().getRoutes()) {
				routeDao.saveOrUpdate(route);
			}

			if (saveStopsForRoute) {

				for (Route route : vehiclesForAgencyResult.getData().getReferences().getRoutes()) {

					try {
						Thread.sleep(100);//make sure we dont hit the api to hard
						StopsForRoute stopsForRoute = stopsForRouteFetcher.fetch(route.getId());

						Set<String> stopIds = new LinkedHashSet<String>();
						for (StopGrouping stopGrouping : stopsForRoute.getData().getEntry()
								.getStopGroupings()) {
							for (StopGroup stopGroup : stopGrouping.getStopGroups()) {
								for (String stopId : stopGroup.getStopIds()) {
									stopIds.add(stopId);
								}
							}
						}

						int order = 0;
						for (String stopId : stopIds) {
							RouteStop routeStop = new RouteStop(route.getId(), stopId, order++);
							routeStopDao.saveOrUpdate(routeStop);
						}
					} catch (Exception e) {
						log.error(e);
					}

				}

			}
		}
	}

}
