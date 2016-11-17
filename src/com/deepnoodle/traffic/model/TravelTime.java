
package com.deepnoodle.traffic.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.deepnoodle.model.FetchResult;
import com.deepnoodle.model.IsEntity;
import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "TravelTime")
public class TravelTime extends FetchResult implements IsEntity, IsJson {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	Long id;

	private Date createDate = new Date();

	@SerializedName("AverageTime")
	@Expose
	private Integer averageTime;

	@SerializedName("CurrentTime")
	@Expose
	private Integer currentTime;

	@SerializedName("Description")
	@Expose
	private String description;

	@SerializedName("Distance")
	@Expose
	private Double distance;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "description", column = @Column(name = "enddescription")),
			@AttributeOverride(name = "direction", column = @Column(name = "enddirection")),
			@AttributeOverride(name = "latitude", column = @Column(name = "endlatitude")),
			@AttributeOverride(name = "longitude", column = @Column(name = "endlongitude")),
			@AttributeOverride(name = "milePost", column = @Column(name = "endmilePost")),
			@AttributeOverride(name = "roadName", column = @Column(name = "endroadName"))
	})
	@SerializedName("EndPoint")
	@Expose
	private TravelPoint endPoint;

	@SerializedName("Name")
	@Expose
	private String name;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "description", column = @Column(name = "startdescription")),
			@AttributeOverride(name = "direction", column = @Column(name = "startdirection")),
			@AttributeOverride(name = "latitude", column = @Column(name = "startlatitude")),
			@AttributeOverride(name = "longitude", column = @Column(name = "startlongitude")),
			@AttributeOverride(name = "milePost", column = @Column(name = "startmilePost")),
			@AttributeOverride(name = "roadName", column = @Column(name = "startroadName"))
	})
	@SerializedName("StartPoint")
	@Expose
	private TravelPoint startPoint;

	@SerializedName("TimeUpdated")
	@Expose
	private String timeUpdated;

	@SerializedName("TravelTimeID")
	@Expose
	private Integer travelTimeID;

	/**
	 * 
	 * @return
	 *     The averageTime
	 */
	public Integer getAverageTime() {
		return averageTime;
	}

	/**
	 * 
	 * @param averageTime
	 *     The AverageTime
	 */
	public void setAverageTime(Integer averageTime) {
		this.averageTime = averageTime;
	}

	/**
	 * 
	 * @return
	 *     The currentTime
	 */
	public Integer getCurrentTime() {
		return currentTime;
	}

	/**
	 * 
	 * @param currentTime
	 *     The CurrentTime
	 */
	public void setCurrentTime(Integer currentTime) {
		this.currentTime = currentTime;
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
	 *     The distance
	 */
	public Double getDistance() {
		return distance;
	}

	/**
	 * 
	 * @param distance
	 *     The Distance
	 */
	public void setDistance(Double distance) {
		this.distance = distance;
	}

	/**
	 * 
	 * @return
	 *     The endPoint
	 */
	public TravelPoint getEndPoint() {
		return endPoint;
	}

	/**
	 * 
	 * @param endPoint
	 *     The EndPoint
	 */
	public void setEndPoint(TravelPoint endPoint) {
		this.endPoint = endPoint;
	}

	/**
	 * 
	 * @return
	 *     The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *     The Name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 *     The startPoint
	 */
	public TravelPoint getStartPoint() {
		return startPoint;
	}

	/**
	 * 
	 * @param startPoint
	 *     The StartPoint
	 */
	public void setStartPoint(TravelPoint startPoint) {
		this.startPoint = startPoint;
	}

	/**
	 * 
	 * @return
	 *     The timeUpdated
	 */
	public String getTimeUpdated() {
		return timeUpdated;
	}

	/**
	 * 
	 * @param timeUpdated
	 *     The TimeUpdated
	 */
	public void setTimeUpdated(String timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	/**
	 * 
	 * @return
	 *     The travelTimeID
	 */
	public Integer getTravelTimeID() {
		return travelTimeID;
	}

	/**
	 * 
	 * @param travelTimeID
	 *     The TravelTimeID
	 */
	public void setTravelTimeID(Integer travelTimeID) {
		this.travelTimeID = travelTimeID;
	}

	public Date getCreateDate() {
		return createDate;
	}

}
