
package com.deepnoodle.metro.model;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.deepnoodle.model.IsEntity;
import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "VehicleStatus")
public class VehicleStatus implements IsEntity, IsJson {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	Long id;

	private Date createDate = new Date();

	@SerializedName("lastLocationUpdateTime")
	@Expose
	private Long lastLocationUpdateTime;

	@SerializedName("lastUpdateTime")
	@Expose
	private Long lastUpdateTime;

	@Embedded
	@SerializedName("location")
	@Expose
	private MetroLocation location;

	@SerializedName("phase")
	@Expose
	private String phase;

	@SerializedName("status")
	@Expose
	private String status;

	@SerializedName("tripId")
	@Expose
	private String tripId;

	@Embedded
	@SerializedName("tripStatus")
	@Expose
	@Transient
	private TripStatus tripStatus;

	@SerializedName("vehicleId")
	@Expose
	private String vehicleId;

	/**
	 * 
	 * @return
	 *     The lastLocationUpdateTime
	 */
	public Long getLastLocationUpdateTime() {
		return lastLocationUpdateTime;
	}

	/**
	 * 
	 * @param lastLocationUpdateTime
	 *     The lastLocationUpdateTime
	 */
	public void setLastLocationUpdateTime(Long lastLocationUpdateTime) {
		this.lastLocationUpdateTime = lastLocationUpdateTime;
	}

	/**
	 * 
	 * @return
	 *     The lastUpdateTime
	 */
	public Long getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * 
	 * @param lastUpdateTime
	 *     The lastUpdateTime
	 */
	public void setLastUpdateTime(Long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * 
	 * @return
	 *     The location
	 */
	public MetroLocation getLocation() {
		return location;
	}

	/**
	 * 
	 * @param location
	 *     The location
	 */
	public void setLocation(MetroLocation location) {
		this.location = location;
	}

	/**
	 * 
	 * @return
	 *     The phase
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * 
	 * @param phase
	 *     The phase
	 */
	public void setPhase(String phase) {
		this.phase = phase;
	}

	/**
	 * 
	 * @return
	 *     The status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 *     The status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 
	 * @return
	 *     The tripId
	 */
	public String getTripId() {
		return tripId;
	}

	/**
	 * 
	 * @param tripId
	 *     The tripId
	 */
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	/**
	 * 
	 * @return
	 *     The tripStatus
	 */
	public TripStatus getTripStatus() {
		return tripStatus;
	}

	/**
	 * 
	 * @param tripStatus
	 *     The tripStatus
	 */
	public void setTripStatus(TripStatus tripStatus) {
		this.tripStatus = tripStatus;
	}

	/**
	 * 
	 * @return
	 *     The vehicleId
	 */
	public String getVehicleId() {
		return vehicleId;
	}

	/**
	 * 
	 * @param vehicleId
	 *     The vehicleId
	 */
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

}
