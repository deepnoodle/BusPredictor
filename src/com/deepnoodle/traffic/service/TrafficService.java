package com.deepnoodle.traffic.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepnoodle.traffic.dao.TravelTimeDao;
import com.deepnoodle.traffic.fetcher.TravelTimesFetcher;
import com.deepnoodle.traffic.model.TravelTime;

@Service
public class TrafficService {
	@Autowired
	private TravelTimesFetcher travelTimesFetcher;

	@Autowired
	private TravelTimeDao travelTimeDao;

	public void fetchAndSave() {
		try {
			List<TravelTime> result = travelTimesFetcher.fetch();
			for (TravelTime travelTime : result) {
				travelTimeDao.save(travelTime);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<TravelTime> getTravelTimes(String direction, Date startDate, Date endDate, Double fromPositionLat,
			Double fromPositionLon,
			Double toPositionLat, Double toPositionLon) {
		return travelTimeDao.get(direction, startDate, endDate, fromPositionLat, fromPositionLon, toPositionLat,
				toPositionLon,
				.01);

	}

	public int calculateTrafficFreeway(String direction, Date startDate, Date endDate, Double fromPositionLat,
			Double fromPositionLon, Double toPositionLat, Double toPositionLon) {
		List<TravelTime> travelTimes = getTravelTimes(direction, startDate, endDate, fromPositionLat,
				fromPositionLon, toPositionLat,
				toPositionLon);
		int travelTime = calculateTravelTime(travelTimes);
		return travelTime;
	}

	private int calculateTravelTime(List<TravelTime> travelTimes) {
		Integer averageTime = 0;
		Double distance = 0D;

		//TODO most recent should have stronger impact
		for (TravelTime travelTime : travelTimes) {
			averageTime += travelTime.getAverageTime();
			distance += travelTime.getDistance();
		}
		int travelTime = (int) ((averageTime / distance / travelTimes.size()) * 100);
		return travelTime;
	}

}
