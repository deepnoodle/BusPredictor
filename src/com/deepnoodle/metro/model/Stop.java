
package com.deepnoodle.metro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.deepnoodle.model.IsEntity;
import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "Stop")
public class Stop implements IsEntity, IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("code")
	@Expose
	private String code;

	@SerializedName("direction")
	@Expose
	private String direction;

	@Id
	@SerializedName("id")
	@Expose
	private String id;

	@SerializedName("lat")
	@Expose
	private Double lat;

	@SerializedName("locationType")
	@Expose
	private Integer locationType;

	@SerializedName("lon")
	@Expose
	private Double lon;

	@SerializedName("name")
	@Expose
	private String name;

	//	@ElementCollection
	//	@CollectionTable(name = "routeIds", joinColumns = @JoinColumn(name = "id"))
	//	@SerializedName("routeIds")
	//	@Expose
	//	private List<String> routeIds = new ArrayList<String>();

	//	@SerializedName("wheelchairBoarding")
	//	@Expose
	//	private String wheelchairBoarding;

	/**
	 * 
	 * @return
	 *     The code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 *     The code
	 */
	public void setCode(String code) {
		this.code = code;
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
	 *     The direction
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

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
	 *     The lat
	 */
	public Double getLat() {
		return lat;
	}

	/**
	 * 
	 * @param lat
	 *     The lat
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}

	/**
	 * 
	 * @return
	 *     The locationType
	 */
	public Integer getLocationType() {
		return locationType;
	}

	/**
	 * 
	 * @param locationType
	 *     The locationType
	 */
	public void setLocationType(Integer locationType) {
		this.locationType = locationType;
	}

	/**
	 * 
	 * @return
	 *     The lon
	 */
	public Double getLon() {
		return lon;
	}

	/**
	 * 
	 * @param lon
	 *     The lon
	 */
	public void setLon(Double lon) {
		this.lon = lon;
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
	 *     The name
	 */
	public void setName(String name) {
		this.name = name;
	}
	//
	//	/**
	//	 * 
	//	 * @return
	//	 *     The routeIds
	//	 */
	//	public List<String> getRouteIds() {
	//		return routeIds;
	//	}
	//
	//	/**
	//	 * 
	//	 * @param routeIds
	//	 *     The routeIds
	//	 */
	//	public void setRouteIds(List<String> routeIds) {
	//		this.routeIds = routeIds;
	//	}

	//	/**
	//	 * 
	//	 * @return
	//	 *     The wheelchairBoarding
	//	 */
	//	public String getWheelchairBoarding() {
	//		return wheelchairBoarding;
	//	}
	//
	//	/**
	//	 * 
	//	 * @param wheelchairBoarding
	//	 *     The wheelchairBoarding
	//	 */
	//	public void setWheelchairBoarding(String wheelchairBoarding) {
	//		this.wheelchairBoarding = wheelchairBoarding;
	//	}

}
