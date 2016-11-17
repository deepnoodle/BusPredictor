
package com.deepnoodle.metro.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Entry implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("polylines")
	@Expose
	private List<Polyline> polylines = new ArrayList<Polyline>();
	@SerializedName("routeId")
	@Expose
	private String routeId;
	@SerializedName("stopGroupings")
	@Expose
	private List<StopGrouping> stopGroupings = new ArrayList<StopGrouping>();
	@SerializedName("stopIds")
	@Expose
	private List<String> stopIds = new ArrayList<String>();

	/**
	 * 
	 * @return
	 *     The polylines
	 */
	public List<Polyline> getPolylines() {
		return polylines;
	}

	/**
	 * 
	 * @param polylines
	 *     The polylines
	 */
	public void setPolylines(List<Polyline> polylines) {
		this.polylines = polylines;
	}

	/**
	 * 
	 * @return
	 *     The routeId
	 */
	public String getRouteId() {
		return routeId;
	}

	/**
	 * 
	 * @param routeId
	 *     The routeId
	 */
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	/**
	 * 
	 * @return
	 *     The stopGroupings
	 */
	public List<StopGrouping> getStopGroupings() {
		return stopGroupings;
	}

	/**
	 * 
	 * @param stopGroupings
	 *     The stopGroupings
	 */
	public void setStopGroupings(List<StopGrouping> stopGroupings) {
		this.stopGroupings = stopGroupings;
	}

	/**
	 * 
	 * @return
	 *     The stopIds
	 */
	public List<String> getStopIds() {
		return stopIds;
	}

	/**
	 * 
	 * @param stopIds
	 *     The stopIds
	 */
	public void setStopIds(List<String> stopIds) {
		this.stopIds = stopIds;
	}

}
