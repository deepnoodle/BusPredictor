
package com.deepnoodle.traffic.model;

import javax.persistence.Embeddable;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Embeddable
public class TravelPoint implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("Description")
	@Expose
	private String description;

	@SerializedName("Direction")
	@Expose
	private String direction;

	@SerializedName("Latitude")
	@Expose
	private Double latitude;

	@SerializedName("Longitude")
	@Expose
	private Double longitude;

	@SerializedName("MilePost")
	@Expose
	private Double milePost;

	@SerializedName("RoadName")
	@Expose
	private String roadName;

	public TravelPoint() {

	}

	public TravelPoint(Double latitude, Double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 * 
	 * @return
	 *     The description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *     The Description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return
	 *     The direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * 
	 * @param direction
	 *     The Direction
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * 
	 * @return
	 *     The latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * 
	 * @param latitude
	 *     The Latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * 
	 * @return
	 *     The longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * 
	 * @param longitude
	 *     The Longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * 
	 * @return
	 *     The milePost
	 */
	public Double getMilePost() {
		return milePost;
	}

	/**
	 * 
	 * @param milePost
	 *     The MilePost
	 */
	public void setMilePost(Double milePost) {
		this.milePost = milePost;
	}

	/**
	 * 
	 * @return
	 *     The roadName
	 */
	public String getRoadName() {
		return roadName;
	}

	/**
	 * 
	 * @param roadName
	 *     The RoadName
	 */
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

}
