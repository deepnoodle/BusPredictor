package com.deepnoodle.metro.dao;

import org.springframework.stereotype.Repository;

import com.deepnoodle.dao.BaseDao;
import com.deepnoodle.metro.model.RouteStop;

@Repository
public class RouteStopDao extends BaseDao<RouteStop> {
	@Override
	protected Class<RouteStop> getEntityClass() {
		return RouteStop.class;
	}
}
