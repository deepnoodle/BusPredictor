package com.deepnoodle.weather.model;

import java.util.Date;

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
@Table(name = "WeatherInfo")
public class WeatherInfo extends FetchResult implements IsEntity, IsJson {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	Long id;

	private Date createDate = new Date();

	@SerializedName("BarometricPressure")
	@Expose
	private Double barometricPressure;

	@SerializedName("Latitude")
	@Expose
	private Double latitude;

	@SerializedName("Longitude")
	@Expose
	private Double longitude;

	@SerializedName("PrecipitationInInches")
	@Expose
	private Double precipitationInInches;

	@SerializedName("ReadingTime")
	@Expose
	private String readingTime;

	@SerializedName("RelativeHumidity")
	@Expose
	private Double relativeHumidity;

	@SerializedName("SkyCoverage")
	@Expose
	private String skyCoverage;

	@SerializedName("StationID")
	@Expose
	private Integer stationID;

	@SerializedName("StationName")
	@Expose
	private String stationName;

	@SerializedName("TemperatureInFahrenheit")
	@Expose
	private Double temperatureInFahrenheit;

	@SerializedName("Visibility")
	@Expose
	private Integer visibility;

	@SerializedName("WindDirection")
	@Expose
	private Double windDirection;

	@SerializedName("WindDirectionCardinal")
	@Expose
	private String windDirectionCardinal;

	@SerializedName("WindGustSpeedInMPH")
	@Expose
	private Double windGustSpeedInMPH;

	@SerializedName("WindSpeedInMPH")
	@Expose
	private Double windSpeedInMPH;

	/**
	* 
	* @return
	* The barometricPressure
	*/
	public Double getBarometricPressure() {
		return barometricPressure;
	}

	/**
	* 
	* @param barometricPressure
	* The BarometricPressure
	*/
	public void setBarometricPressure(Double barometricPressure) {
		this.barometricPressure = barometricPressure;
	}

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
	* The precipitationInInches
	*/
	public Double getPrecipitationInInches() {
		return precipitationInInches;
	}

	/**
	* 
	* @param precipitationInInches
	* The PrecipitationInInches
	*/
	public void setPrecipitationInInches(Double precipitationInInches) {
		this.precipitationInInches = precipitationInInches;
	}

	/**
	* 
	* @return
	* The readingTime
	*/
	public String getReadingTime() {
		return readingTime;
	}

	/**
	* 
	* @param readingTime
	* The ReadingTime
	*/
	public void setReadingTime(String readingTime) {
		this.readingTime = readingTime;
	}

	/**
	* 
	* @return
	* The relativeHumidity
	*/
	public Double getRelativeHumidity() {
		return relativeHumidity;
	}

	/**
	* 
	* @param relativeHumidity
	* The RelativeHumidity
	*/
	public void setRelativeHumidity(Double relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}

	/**
	* 
	* @return
	* The skyCoverage
	*/
	public String getSkyCoverage() {
		return skyCoverage;
	}

	/**
	* 
	* @param skyCoverage
	* The SkyCoverage
	*/
	public void setSkyCoverage(String skyCoverage) {
		this.skyCoverage = skyCoverage;
	}

	/**
	* 
	* @return
	* The stationID
	*/
	public Integer getStationID() {
		return stationID;
	}

	/**
	* 
	* @param stationID
	* The StationID
	*/
	public void setStationID(Integer stationID) {
		this.stationID = stationID;
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

	/**
	* 
	* @return
	* The temperatureInFahrenheit
	*/
	public Double getTemperatureInFahrenheit() {
		return temperatureInFahrenheit;
	}

	/**
	* 
	* @param temperatureInFahrenheit
	* The TemperatureInFahrenheit
	*/
	public void setTemperatureInFahrenheit(Double temperatureInFahrenheit) {
		this.temperatureInFahrenheit = temperatureInFahrenheit;
	}

	/**
	* 
	* @return
	* The visibility
	*/
	public Integer getVisibility() {
		return visibility;
	}

	/**
	* 
	* @param visibility
	* The Visibility
	*/
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	/**
	* 
	* @return
	* The windDirection
	*/
	public Double getWindDirection() {
		return windDirection;
	}

	/**
	* 
	* @param windDirection
	* The WindDirection
	*/
	public void setWindDirection(Double windDirection) {
		this.windDirection = windDirection;
	}

	/**
	* 
	* @return
	* The windDirectionCardinal
	*/
	public String getWindDirectionCardinal() {
		return windDirectionCardinal;
	}

	/**
	* 
	* @param windDirectionCardinal
	* The WindDirectionCardinal
	*/
	public void setWindDirectionCardinal(String windDirectionCardinal) {
		this.windDirectionCardinal = windDirectionCardinal;
	}

	/**
	* 
	* @return
	* The windGustSpeedInMPH
	*/
	public Double getWindGustSpeedInMPH() {
		return windGustSpeedInMPH;
	}

	/**
	* 
	* @param windGustSpeedInMPH
	* The WindGustSpeedInMPH
	*/
	public void setWindGustSpeedInMPH(Double windGustSpeedInMPH) {
		this.windGustSpeedInMPH = windGustSpeedInMPH;
	}

	/**
	* 
	* @return
	* The windSpeedInMPH
	*/
	public Double getWindSpeedInMPH() {
		return windSpeedInMPH;
	}

	/**
	* 
	* @param windSpeedInMPH
	* The WindSpeedInMPH
	*/
	public void setWindSpeedInMPH(Double windSpeedInMPH) {
		this.windSpeedInMPH = windSpeedInMPH;
	}

}
