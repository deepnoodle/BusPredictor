package com.deepnoodle.metro.dao;

import org.springframework.stereotype.Repository;

import com.deepnoodle.dao.BaseDao;
import com.deepnoodle.metro.model.VehicleStatus;

@Repository
public class VehicleStatusDao extends BaseDao<VehicleStatus> {
	@Override
	protected Class<VehicleStatus> getEntityClass() {
		return VehicleStatus.class;
	}
}
