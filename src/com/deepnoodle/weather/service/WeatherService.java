package com.deepnoodle.weather.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepnoodle.metro.service.IsService;
import com.deepnoodle.weather.dao.WeatherInfoDao;
import com.deepnoodle.weather.dao.WeatherStationDao;
import com.deepnoodle.weather.fetcher.WeatherInfoFetcher;
import com.deepnoodle.weather.fetcher.WeatherStationFetcher;
import com.deepnoodle.weather.model.WeatherInfo;
import com.deepnoodle.weather.model.WeatherStation;

@Service
public class WeatherService implements IsService {
	@Autowired
	private WeatherStationFetcher weatherStationFetcher;

	@Autowired
	private WeatherInfoFetcher weatherInfoFetcher;

	@Autowired
	private WeatherStationDao weatherStationDao;

	@Autowired
	private WeatherInfoDao weatherInfoDao;

	public void fetchAndSaveWeatherStations() throws ClientProtocolException, IOException {
		List<WeatherStation> result = weatherStationFetcher.fetch();

		for (WeatherStation weatherStation : result) {
			weatherStationDao.saveOrUpdate(weatherStation);
		}
	}

	public void fetchAndSaveWeatherInfo() throws ClientProtocolException, IOException {
		List<WeatherInfo> results = weatherInfoFetcher.fetch();
		for (WeatherInfo weatherInfo : results) {
			weatherInfoDao.save(weatherInfo);
		}
	}
}
