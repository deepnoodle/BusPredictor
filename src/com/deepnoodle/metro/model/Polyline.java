
package com.deepnoodle.metro.model;

import javax.annotation.Generated;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Polyline implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("length")
	@Expose
	private Integer length;
	@SerializedName("levels")
	@Expose
	private String levels;
	@SerializedName("points")
	@Expose
	private String points;

	/**
	 * 
	 * @return
	 *     The length
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * 
	 * @param length
	 *     The length
	 */
	public void setLength(Integer length) {
		this.length = length;
	}

	/**
	 * 
	 * @return
	 *     The levels
	 */
	public String getLevels() {
		return levels;
	}

	/**
	 * 
	 * @param levels
	 *     The levels
	 */
	public void setLevels(String levels) {
		this.levels = levels;
	}

	/**
	 * 
	 * @return
	 *     The points
	 */
	public String getPoints() {
		return points;
	}

	/**
	 * 
	 * @param points
	 *     The points
	 */
	public void setPoints(String points) {
		this.points = points;
	}

}
