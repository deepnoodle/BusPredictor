
package com.deepnoodle.metro.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class StopGroup implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("name")
	@Expose
	private Name name;
	@SerializedName("polylines")
	@Expose
	private List<Polyline> polylines = new ArrayList<Polyline>();
	@SerializedName("stopIds")
	@Expose
	private List<String> stopIds = new ArrayList<String>();
	@SerializedName("subGroups")
	@Expose
	private List<Object> subGroups = new ArrayList<Object>();

	/**
	 * 
	 * @return
	 *     The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *     The id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 *     The name
	 */
	public Name getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *     The name
	 */
	public void setName(Name name) {
		this.name = name;
	}

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

	/**
	 * 
	 * @return
	 *     The subGroups
	 */
	public List<Object> getSubGroups() {
		return subGroups;
	}

	/**
	 * 
	 * @param subGroups
	 *     The subGroups
	 */
	public void setSubGroups(List<Object> subGroups) {
		this.subGroups = subGroups;
	}

}
