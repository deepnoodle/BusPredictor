package com.deepnoodle.dao;

import com.deepnoodle.model.MetroInput;

public class MetroInputDao extends BaseDao<MetroInput> {
	@Override
	protected Class<MetroInput> getEntityClass() {
		return MetroInput.class;
	}

}
