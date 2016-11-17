
package com.deepnoodle.metro.model;

import java.util.ArrayList;
import java.util.List;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class References implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("agencies")
	@Expose
	private List<Agency> agencies = new ArrayList<Agency>();
	@SerializedName("routes")
	@Expose
	private List<Route> routes = new ArrayList<Route>();
	@SerializedName("situations")
	@Expose
	private List<Object> situations = new ArrayList<Object>();
	@SerializedName("stops")
	@Expose
	private List<Stop> stops = new ArrayList<Stop>();

	/**
	 * 
	 * @return
	 *     The agencies
	 */
	public List<Agency> getAgencies() {
		return agencies;
	}

	/**
	 * 
	 * @param agencies
	 *     The agencies
	 */
	public void setAgencies(List<Agency> agencies) {
		this.agencies = agencies;
	}

	/**
	 * 
	 * @return
	 *     The routes
	 */
	public List<Route> getRoutes() {
		return routes;
	}

	/**
	 * 
	 * @param routes
	 *     The routes
	 */
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	/**
	 * 
	 * @return
	 *     The situations
	 */
	public List<Object> getSituations() {
		return situations;
	}

	/**
	 * 
	 * @param situations
	 *     The situations
	 */
	public void setSituations(List<Object> situations) {
		this.situations = situations;
	}

	/**
	 * 
	 * @return
	 *     The stops
	 */
	public List<Stop> getStops() {
		return stops;
	}

	/**
	 * 
	 * @param stops
	 *     The stops
	 */
	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}

}
