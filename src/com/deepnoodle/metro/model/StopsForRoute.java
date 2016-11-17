
package com.deepnoodle.metro.model;

import com.deepnoodle.model.FetchResult;
import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StopsForRoute extends FetchResult implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("code")
	@Expose
	private Integer code;

	@SerializedName("currentTime")
	@Expose
	private Long currentTime;

	@SerializedName("data")
	@Expose
	private StopsForRouteData data;

	@SerializedName("text")
	@Expose
	private String text;

	@SerializedName("version")
	@Expose
	private Integer version;

	/**
	 * 
	 * @return
	 *     The code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 *     The code
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * 
	 * @return
	 *     The currentTime
	 */
	public Long getCurrentTime() {
		return currentTime;
	}

	/**
	 * 
	 * @param currentTime
	 *     The currentTime
	 */
	public void setCurrentTime(Long currentTime) {
		this.currentTime = currentTime;
	}

	/**
	 * 
	 * @return
	 *     The data
	 */
	public StopsForRouteData getData() {
		return data;
	}

	/**
	 * 
	 * @param data
	 *     The data
	 */
	public void setData(StopsForRouteData data) {
		this.data = data;
	}

	/**
	 * 
	 * @return
	 *     The text
	 */
	public String getText() {
		return text;
	}

	/**
	 * 
	 * @param text
	 *     The text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * 
	 * @return
	 *     The version
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * 
	 * @param version
	 *     The version
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

}
