package com.deepnoodle.metro.fetcher;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Component;

import com.deepnoodle.fetcher.BaseObjectFetcher;
import com.deepnoodle.metro.model.StopsForRoute;;

@Component
public class StopsForRouteFetcher extends BaseObjectFetcher<StopsForRoute> {
	private static final String DATAURL = "api.pugetsound.onebusaway.org";
	private static final String PATH = "/api/where/stops-for-route/{routeId}.json?key=62d038b9-4ae6-4785-bdeb-8b2072419299";
	private String routeId;

	public StopsForRoute fetch(String routeId) throws ClientProtocolException, IOException {
		this.routeId = routeId;
		return super.fetch();
	}

	@Override
	protected Class<StopsForRoute> getResultClass() {
		return StopsForRoute.class;
	}

	@Override
	protected String getPath() {
		return PATH.replace("{routeId}", routeId);
	}

	@Override
	protected String getDataUrl() {
		return DATAURL;
	}

}
