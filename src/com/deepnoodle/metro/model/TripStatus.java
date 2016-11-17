
package com.deepnoodle.metro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.deepnoodle.model.IsEntity;
import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "TripStatus",
		indexes = { @Index(columnList = "activeTripId, createDate"), @Index(columnList = "closestStop, createDate") })
public class TripStatus implements IsEntity, IsJson {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	Long id;

	private Date createDate = new Date();

	@SerializedName("activeTripId")
	@Expose
	private String activeTripId;

	@SerializedName("blockTripSequence")
	@Expose
	private Integer blockTripSequence;

	@SerializedName("closestStop")
	@Expose
	private String closestStop;

	@SerializedName("closestStopTimeOffset")
	@Expose
	private Integer closestStopTimeOffset;

	@SerializedName("distanceAlongTrip")
	@Expose
	private Double distanceAlongTrip;

	@SerializedName("frequency")
	@Expose
	@Transient
	private Object frequency;

	@SerializedName("lastKnownDistanceAlongTrip")
	@Expose
	private Integer lastKnownDistanceAlongTrip;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "lat", column = @Column(name = "lastKnownLocationLat")),
			@AttributeOverride(name = "lon", column = @Column(name = "lastKnownLocationLon"))
	})
	@SerializedName("lastKnownLocation")
	@Expose
	private MetroLocation lastKnownLocation;

	@SerializedName("lastKnownOrientation")
	@Expose
	private Integer lastKnownOrientation;

	@SerializedName("lastLocationUpdateTime")
	@Expose
	private Long lastLocationUpdateTime;

	@SerializedName("lastUpdateTime")
	@Expose
	private Long lastUpdateTime;

	@SerializedName("nextStop")
	@Expose
	private String nextStop;

	@SerializedName("nextStopTimeOffset")
	@Expose
	private Integer nextStopTimeOffset;

	@SerializedName("orientation")
	@Expose
	private Double orientation;

	@SerializedName("phase")
	@Expose
	private String phase;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "lat", column = @Column(name = "positionLat")),
			@AttributeOverride(name = "lon", column = @Column(name = "positionLon"))
	})
	@SerializedName("position")
	@Expose
	private MetroLocation position;

	@SerializedName("predicted")
	@Expose
	private Boolean predicted;

	@SerializedName("scheduleDeviation")
	@Expose
	private Integer scheduleDeviation;

	@SerializedName("scheduledDistanceAlongTrip")
	@Expose
	private Double scheduledDistanceAlongTrip;

	@SerializedName("serviceDate")
	@Expose
	private Long serviceDate;

	@SerializedName("situationIds")
	@Expose
	@Transient
	private List<Object> situationIds = new ArrayList<Object>();

	@SerializedName("status")
	@Expose
	private String status;

	@SerializedName("totalDistanceAlongTrip")
	@Expose
	private Double totalDistanceAlongTrip;

	@SerializedName("vehicleId")
	@Expose
	private String vehicleId;

	/**
	 * 
	 * @return
	 *     The activeTripId
	 */
	public String getActiveTripId() {
		return activeTripId;
	}

	/**
	 * 
	 * @param activeTripId
	 *     The activeTripId
	 */
	public void setActiveTripId(String activeTripId) {
		this.activeTripId = activeTripId;
	}

	/**
	 * 
	 * @return
	 *     The blockTripSequence
	 */
	public Integer getBlockTripSequence() {
		return blockTripSequence;
	}

	/**
	 * 
	 * @param blockTripSequence
	 *     The blockTripSequence
	 */
	public void setBlockTripSequence(Integer blockTripSequence) {
		this.blockTripSequence = blockTripSequence;
	}

	/**
	 * 
	 * @return
	 *     The closestStop
	 */
	public String getClosestStop() {
		return closestStop;
	}

	/**
	 * 
	 * @param closestStop
	 *     The closestStop
	 */
	public void setClosestStop(String closestStop) {
		this.closestStop = closestStop;
	}

	/**
	 * 
	 * @return
	 *     The closestStopTimeOffset
	 */
	public Integer getClosestStopTimeOffset() {
		return closestStopTimeOffset;
	}

	/**
	 * 
	 * @param closestStopTimeOffset
	 *     The closestStopTimeOffset
	 */
	public void setClosestStopTimeOffset(Integer closestStopTimeOffset) {
		this.closestStopTimeOffset = closestStopTimeOffset;
	}

	/**
	 * 
	 * @return
	 *     The distanceAlongTrip
	 */
	public Double getDistanceAlongTrip() {
		return distanceAlongTrip;
	}

	/**
	 * 
	 * @param distanceAlongTrip
	 *     The distanceAlongTrip
	 */
	public void setDistanceAlongTrip(Double distanceAlongTrip) {
		this.distanceAlongTrip = distanceAlongTrip;
	}

	/**
	 * 
	 * @return
	 *     The frequency
	 */
	public Object getFrequency() {
		return frequency;
	}

	/**
	 * 
	 * @param frequency
	 *     The frequency
	 */
	public void setFrequency(Object frequency) {
		this.frequency = frequency;
	}

	/**
	 * 
	 * @return
	 *     The lastKnownDistanceAlongTrip
	 */
	public Integer getLastKnownDistanceAlongTrip() {
		return lastKnownDistanceAlongTrip;
	}

	/**
	 * 
	 * @param lastKnownDistanceAlongTrip
	 *     The lastKnownDistanceAlongTrip
	 */
	public void setLastKnownDistanceAlongTrip(Integer lastKnownDistanceAlongTrip) {
		this.lastKnownDistanceAlongTrip = lastKnownDistanceAlongTrip;
	}

	/**
	 * 
	 * @return
	 *     The lastKnownLocation
	 */
	public MetroLocation getLastKnownLocation() {
		return lastKnownLocation;
	}

	/**
	 * 
	 * @param lastKnownLocation
	 *     The lastKnownLocation
	 */
	public void setLastKnownLocation(MetroLocation lastKnownLocation) {
		this.lastKnownLocation = lastKnownLocation;
	}

	/**
	 * 
	 * @return
	 *     The lastKnownOrientation
	 */
	public Integer getLastKnownOrientation() {
		return lastKnownOrientation;
	}

	/**
	 * 
	 * @param lastKnownOrientation
	 *     The lastKnownOrientation
	 */
	public void setLastKnownOrientation(Integer lastKnownOrientation) {
		this.lastKnownOrientation = lastKnownOrientation;
	}

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
	 *     The nextStop
	 */
	public String getNextStop() {
		return nextStop;
	}

	/**
	 * 
	 * @param nextStop
	 *     The nextStop
	 */
	public void setNextStop(String nextStop) {
		this.nextStop = nextStop;
	}

	/**
	 * 
	 * @return
	 *     The nextStopTimeOffset
	 */
	public Integer getNextStopTimeOffset() {
		return nextStopTimeOffset;
	}

	/**
	 * 
	 * @param nextStopTimeOffset
	 *     The nextStopTimeOffset
	 */
	public void setNextStopTimeOffset(Integer nextStopTimeOffset) {
		this.nextStopTimeOffset = nextStopTimeOffset;
	}

	/**
	 * 
	 * @return
	 *     The orientation
	 */
	public Double getOrientation() {
		return orientation;
	}

	/**
	 * 
	 * @param orientation
	 *     The orientation
	 */
	public void setOrientation(Double orientation) {
		this.orientation = orientation;
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
	 *     The position
	 */
	public MetroLocation getPosition() {
		return position;
	}

	/**
	 * 
	 * @param position
	 *     The position
	 */
	public void setPosition(MetroLocation position) {
		this.position = position;
	}

	/**
	 * 
	 * @return
	 *     The predicted
	 */
	public Boolean getPredicted() {
		return predicted;
	}

	/**
	 * 
	 * @param predicted
	 *     The predicted
	 */
	public void setPredicted(Boolean predicted) {
		this.predicted = predicted;
	}

	/**
	 * 
	 * @return
	 *     The scheduleDeviation
	 */
	public Integer getScheduleDeviation() {
		return scheduleDeviation;
	}

	/**
	 * 
	 * @param scheduleDeviation
	 *     The scheduleDeviation
	 */
	public void setScheduleDeviation(Integer scheduleDeviation) {
		this.scheduleDeviation = scheduleDeviation;
	}

	/**
	 * 
	 * @return
	 *     The scheduledDistanceAlongTrip
	 */
	public Double getScheduledDistanceAlongTrip() {
		return scheduledDistanceAlongTrip;
	}

	/**
	 * 
	 * @param scheduledDistanceAlongTrip
	 *     The scheduledDistanceAlongTrip
	 */
	public void setScheduledDistanceAlongTrip(Double scheduledDistanceAlongTrip) {
		this.scheduledDistanceAlongTrip = scheduledDistanceAlongTrip;
	}

	/**
	 * 
	 * @return
	 *     The serviceDate
	 */
	public Long getServiceDate() {
		return serviceDate;
	}

	/**
	 * 
	 * @param serviceDate
	 *     The serviceDate
	 */
	public void setServiceDate(Long serviceDate) {
		this.serviceDate = serviceDate;
	}

	/**
	 * 
	 * @return
	 *     The situationIds
	 */
	public List<Object> getSituationIds() {
		return situationIds;
	}

	/**
	 * 
	 * @param situationIds
	 *     The situationIds
	 */
	public void setSituationIds(List<Object> situationIds) {
		this.situationIds = situationIds;
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
	 *     The totalDistanceAlongTrip
	 */
	public Double getTotalDistanceAlongTrip() {
		return totalDistanceAlongTrip;
	}

	/**
	 * 
	 * @param totalDistanceAlongTrip
	 *     The totalDistanceAlongTrip
	 */
	public void setTotalDistanceAlongTrip(Double totalDistanceAlongTrip) {
		this.totalDistanceAlongTrip = totalDistanceAlongTrip;
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

	public Date getCreateDate() {
		return createDate;
	}

}
