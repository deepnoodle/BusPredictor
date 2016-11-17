
package com.deepnoodle.weather.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.deepnoodle.model.FetchResult;
import com.deepnoodle.model.IsEntity;
import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "WeatherStation")
public class WeatherStation extends FetchResult implements IsEntity, IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("Latitude")
	@Expose
	private Double latitude;

	@SerializedName("Longitude")
	@Expose
	private Double longitude;

	@Id
	@SerializedName("StationCode")
	@Expose
	private Integer stationCode;

	@SerializedName("StationName")
	@Expose
	private String stationName;

	/**
	* 
	* @return
	* The latitude
	*/
	public Double getLatitude() {
		return latitude;
	}

	/**
	* 
	* @param latitude
	* The Latitude
	*/
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	* 
	* @return
	* The longitude
	*/
	public Double getLongitude() {
		return longitude;
	}

	/**
	* 
	* @param longitude
	* The Longitude
	*/
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	* 
	* @return
	* The stationCode
	*/
	public Integer getStationCode() {
		return stationCode;
	}

	/**
	* 
	* @param stationCode
	* The StationCode
	*/
	public void setStationCode(Integer stationCode) {
		this.stationCode = stationCode;
	}

	/**
	* 
	* @return
	* The stationName
	*/
	public String getStationName() {
		return stationName;
	}

	/**
	* 
	* @param stationName
	* The StationName
	*/
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}
