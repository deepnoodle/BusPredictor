package com.deepnoodle.fetcher;

import com.deepnoodle.model.FetchResult;
import com.google.gson.Gson;

public abstract class BaseObjectFetcher<T extends FetchResult> extends BaseFetcher<T> {

	@Override
	protected T buildResult(String jsonResult) {
		T result = new Gson().fromJson(jsonResult, getResultClass());
		return result;
	}

	protected abstract Class<T> getResultClass();

}
