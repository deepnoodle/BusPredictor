package com.deepnoodle.fetcher;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public abstract class BaseFetcher<T> {
	private static final Logger log = LogManager.getLogger(BaseFetcher.class);

	public T fetch() throws ClientProtocolException, IOException {
		try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {

			HttpHost target = new HttpHost(getDataUrl(), 80, "http");

			HttpGet getRequest = new HttpGet(getPath());

			HttpResponse httpResponse = httpClient.execute(target, getRequest);
			HttpEntity entity = httpResponse.getEntity();

			printHeaders(httpResponse);

			if (entity != null) {
				return buildResult(EntityUtils.toString(entity));

			}
		}
		return null;
	}

	protected abstract T buildResult(String jsonResult);

	protected abstract String getPath();

	protected abstract String getDataUrl();

	private void printHeaders(HttpResponse httpResponse) {
		log.info("----------------------------------------");
		log.info(httpResponse.getStatusLine());
		Header[] headers = httpResponse.getAllHeaders();
		for (int i = 0; i < headers.length; i++) {
			log.info(headers[i]);
		}
		log.info("----------------------------------------");
	}

}
