
package com.deepnoodle.metro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.deepnoodle.model.IsEntity;
import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "Route")
public class Route implements IsEntity, IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("agencyId")
	@Expose
	private String agencyId;

	@SerializedName("color")
	@Expose
	private String color;

	@SerializedName("description")
	@Expose
	private String description;

	@Id
	@SerializedName("id")
	@Expose
	private String id;

	@SerializedName("longName")
	@Expose
	private String longName;

	@SerializedName("shortName")
	@Expose
	private String shortName;

	@SerializedName("textColor")
	@Expose
	private String textColor;

	@SerializedName("type")
	@Expose
	private Integer type;

	@SerializedName("url")
	@Expose
	private String url;

	/**
	 * 
	 * @return
	 *     The agencyId
	 */
	public String getAgencyId() {
		return agencyId;
	}

	/**
	 * 
	 * @param agencyId
	 *     The agencyId
	 */
	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	/**
	 * 
	 * @return
	 *     The color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * @param color
	 *     The color
	 */
	public void setColor(String color) {
		this.color = color;
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
	 *     The description
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 *     The longName
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * 
	 * @param longName
	 *     The longName
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}

	/**
	 * 
	 * @return
	 *     The shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * 
	 * @param shortName
	 *     The shortName
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * 
	 * @return
	 *     The textColor
	 */
	public String getTextColor() {
		return textColor;
	}

	/**
	 * 
	 * @param textColor
	 *     The textColor
	 */
	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	/**
	 * 
	 * @return
	 *     The type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *     The type
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 
	 * @return
	 *     The url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 
	 * @param url
	 *     The url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
