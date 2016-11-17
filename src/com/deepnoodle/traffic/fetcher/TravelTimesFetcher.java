package com.deepnoodle.traffic.fetcher;

import java.lang.reflect.Type;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.deepnoodle.fetcher.BaseListFetcher;
import com.deepnoodle.traffic.model.TravelTime;
import com.google.gson.reflect.TypeToken;

@Component
public class TravelTimesFetcher extends BaseListFetcher<TravelTime> {
	private static final String DATAURL = "wsdot.com";
	private static final String PATH = "/Traffic/api/TravelTimes/TravelTimesREST.svc/GetTravelTimesAsJson?AccessCode=3689becd-1582-484f-9629-89489984fc2b";

	@Override
	protected Type getListType() {
		return new TypeToken<ArrayList<TravelTime>>() {
		}.getType();
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
