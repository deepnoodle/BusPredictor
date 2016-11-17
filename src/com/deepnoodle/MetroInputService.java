package com.deepnoodle;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepnoodle.metro.model.TripStatus;
import com.deepnoodle.metro.service.MetroService;
import com.deepnoodle.model.MetroInput;
import com.deepnoodle.traffic.service.TrafficService;
import com.deepnoodle.weather.service.WeatherService;

@Service
public class MetroInputService {
	@Autowired
	private MetroService metroService;

	@Autowired
	private TrafficService trafficService;

	@Autowired
	private WeatherService weatherService;

	public MetroInput buildMetroInput(TripStatus tripStatus) {
		MetroInput metroInput = new MetroInput();

		Date startDate = tripStatus.getCreateDate();
		Date endDate = tripStatus.getCreateDate();
		Double fromPositionLat = tripStatus.getPosition().getLat();
		Double fromPositionLon = tripStatus.getPosition().getLon();
		Double toPositionLat = tripStatus.getPosition().getLat();
		Double toPositionLon = tripStatus.getPosition().getLon();

		int trafficFreewayN = trafficService.calculateTrafficFreeway("N", startDate, endDate, fromPositionLat,
				fromPositionLon, toPositionLat, toPositionLon);
		metroInput.setTrafficFreewayN(trafficFreewayN);

		int trafficFreewayE = trafficService.calculateTrafficFreeway("E", startDate, endDate, fromPositionLat,
				fromPositionLon, toPositionLat, toPositionLon);
		metroInput.setTrafficFreewayE(trafficFreewayE);

		int trafficFreewayW = trafficService.calculateTrafficFreeway("W", startDate, endDate, fromPositionLat,
				fromPositionLon, toPositionLat, toPositionLon);
		metroInput.setTrafficFreewayW(trafficFreewayW);

		int trafficFreewayS = trafficService.calculateTrafficFreeway("S", startDate, endDate, fromPositionLat,
				fromPositionLon, toPositionLat, toPositionLon);
		metroInput.setTrafficFreewayS(trafficFreewayS);

		return metroInput;

	}

}
