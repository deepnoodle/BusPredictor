package com.deepnoodle.weather.dao;

import org.springframework.stereotype.Repository;

import com.deepnoodle.dao.BaseDao;
import com.deepnoodle.weather.model.WeatherInfo;

@Repository
public class WeatherInfoDao extends BaseDao<WeatherInfo> {
	@Override
	protected Class<WeatherInfo> getEntityClass() {
		return WeatherInfo.class;
	}
}
