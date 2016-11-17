package com.deepnoodle.metro.fetcher;

import org.springframework.stereotype.Component;

import com.deepnoodle.fetcher.BaseObjectFetcher;
import com.deepnoodle.metro.model.VehiclesForAgency;

@Component
public class VehiclesForAgencyFetcher extends BaseObjectFetcher<VehiclesForAgency> {
	private static final String DATAURL = "api.pugetsound.onebusaway.org";
	private static final String PATH = "/api/where/vehicles-for-agency/1.json?key=62d038b9-4ae6-4785-bdeb-8b2072419299";

	@Override
	public Class<VehiclesForAgency> getResultClass() {
		return VehiclesForAgency.class;
	}

	@Override
	protected String getPath() {
		return PATH;
	}

	@Override
	protected String getDataUrl() {
		return DATAURL;
	}
}
