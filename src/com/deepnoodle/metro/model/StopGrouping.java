
package com.deepnoodle.metro.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class StopGrouping implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("ordered")
	@Expose
	private Boolean ordered;
	@SerializedName("stopGroups")
	@Expose
	private List<StopGroup> stopGroups = new ArrayList<StopGroup>();
	@SerializedName("type")
	@Expose
	private String type;

	/**
	 * 
	 * @return
	 *     The ordered
	 */
	public Boolean getOrdered() {
		return ordered;
	}

	/**
	 * 
	 * @param ordered
	 *     The ordered
	 */
	public void setOrdered(Boolean ordered) {
		this.ordered = ordered;
	}

	/**
	 * 
	 * @return
	 *     The stopGroups
	 */
	public List<StopGroup> getStopGroups() {
		return stopGroups;
	}

	/**
	 * 
	 * @param stopGroups
	 *     The stopGroups
	 */
	public void setStopGroups(List<StopGroup> stopGroups) {
		this.stopGroups = stopGroups;
	}

	/**
	 * 
	 * @return
	 *     The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *     The type
	 */
	public void setType(String type) {
		this.type = type;
	}

}
