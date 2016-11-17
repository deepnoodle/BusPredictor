package com.deepnoodle.metro.dao;

import org.springframework.stereotype.Repository;

import com.deepnoodle.dao.BaseDao;
import com.deepnoodle.metro.model.Route;

@Repository
public class RouteDao extends BaseDao<Route> {
	@Override
	protected Class<Route> getEntityClass() {
		return Route.class;
	}
}
