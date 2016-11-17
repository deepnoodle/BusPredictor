package com.deepnoodle.weather.dao;

import org.springframework.stereotype.Repository;

import com.deepnoodle.dao.BaseDao;
import com.deepnoodle.weather.model.WeatherStation;

@Repository
public class WeatherStationDao extends BaseDao<WeatherStation> {
	@Override
	protected Class<WeatherStation> getEntityClass() {
		return WeatherStation.class;
	}
}
