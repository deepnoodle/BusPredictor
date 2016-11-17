
package com.deepnoodle.metro.model;

import javax.persistence.Embeddable;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Embeddable
public class MetroLocation implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("lat")
	@Expose
	private Double lat;
	@SerializedName("lon")
	@Expose
	private Double lon;

	/**
	 * 
	 * @return
	 *     The lat
	 */
	public Double getLat() {
		return lat;
	}

	/**
	 * 
	 * @param lat
	 *     The lat
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}

	/**
	 * 
	 * @return
	 *     The lon
	 */
	public Double getLon() {
		return lon;
	}

	/**
	 * 
	 * @param lon
	 *     The lon
	 */
	public void setLon(Double lon) {
		this.lon = lon;
	}

}
