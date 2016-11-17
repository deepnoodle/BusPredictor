package com.deepnoodle.metro.dao;

import org.springframework.stereotype.Repository;

import com.deepnoodle.dao.BaseDao;
import com.deepnoodle.metro.model.Stop;

@Repository
public class StopDao extends BaseDao<Stop> {

	@Override
	protected Class<Stop> getEntityClass() {
		return Stop.class;
	}
}
