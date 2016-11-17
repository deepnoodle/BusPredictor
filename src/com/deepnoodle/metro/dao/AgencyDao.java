package com.deepnoodle.metro.dao;

import org.springframework.stereotype.Repository;

import com.deepnoodle.dao.BaseDao;
import com.deepnoodle.metro.model.Agency;

@Repository
public class AgencyDao extends BaseDao<Agency> {
	@Override
	protected Class<Agency> getEntityClass() {
		return Agency.class;
	}
}
