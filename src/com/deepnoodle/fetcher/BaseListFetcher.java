package com.deepnoodle.fetcher;

import java.lang.reflect.Type;
import java.util.List;

import com.deepnoodle.model.FetchResult;
import com.google.gson.Gson;

public abstract class BaseListFetcher<T extends FetchResult> extends BaseFetcher<List<T>> {

	@Override
	protected List<T> buildResult(String jsonResult) {

		List<T> result = new Gson().fromJson(jsonResult, getListType());
		return result;
	}

	protected abstract Type getListType();

}
