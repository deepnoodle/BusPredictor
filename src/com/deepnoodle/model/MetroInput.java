package com.deepnoodle.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "MetroInput")
public class MetroInput implements IsEntity {
	private static final long serialVersionUID = 1L;

	/*	  
	drop table if exists metroInput;
	CREATE TABLE `metro`.`metroInput` (
	id INT NOT NULL AUTO_INCREMENT,
	stopDate datetime NULL,
	currentStopId INT NULL,
	futureStopId INT NULL,
	minutesToStop TINYINT(4) NULL,
	traffic TINYINT(4) NULL,
	temp TINYINT(4) NULL,
	lastHourTemp TINYINT(4) NULL,
	lastFourHourTemp TINYINT(4) NULL,
	rain TINYINT(4) NULL,
	lastHourRain TINYINT(4) NULL,
	lastFourHourRain TINYINT(4) NULL,
	snow TINYINT(4) NULL,
	lastHourSnow TINYINT(4) NULL,
	lastFourHourSnow TINYINT(4) NULL,
	wind TINYINT(4) NULL,
	lastHourWind TINYINT(4) NULL,
	lastFourHourWind TINYINT(4) NULL,
	holiday TINYINT(4) NULL,
	futureHoliday TINYINT(4) NULL,
	pastHoliday TINYINT(4) NULL,
	futureHolidayThreeDays TINYINT(4) NULL,
	pastHolidayThreeDays TINYINT(4) NULL,
	prevBusBehind TINYINT(4) NULL,
	nextBusAhead TINYINT(4) NULL,
	PRIMARY KEY (`id`));
	*/
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Integer id;

	private Date createDate = new Date();
	private Integer routeId;
	private Integer currentStopId;
	private Integer futureStopId;
	private Integer minutesToStop;
	private Date stopDate;
	private Integer trafficFreewayN;
	private Integer trafficFreewayE;
	private Integer trafficFreewayW;
	private Integer trafficFreewayS;
	private Integer temp;
	private Integer lastHourTemp;
	private Integer lastFourHourTemp;
	private Integer rain;
	private Integer lastHourRain;
	private Integer lastFourHourRain;
	private Integer snow;
	private Integer lastHourSnow;
	private Integer lastFourHourSnow;
	private Integer wind;
	private Integer lastHourWind;
	private Integer lastFourHourWind;
	private Integer holiday;
	private Integer futureHoliday;
	private Integer pastHoliday;
	private Integer futureHolidayThreeDays;
	private Integer pastHolidayThreeDays;
	private Integer prevBusBehind;
	private Integer nextBusAhead;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRouteId() {
		return routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public Integer getCurrentStopId() {
		return currentStopId;
	}

	public void setCurrentStopId(Integer currentStopId) {
		this.currentStopId = currentStopId;
	}

	public Integer getFutureStopId() {
		return futureStopId;
	}

	public void setFutureStopId(Integer futureStopId) {
		this.futureStopId = futureStopId;
	}

	public Integer getMinutesToStop() {
		return minutesToStop;
	}

	public void setMinutesToStop(Integer minutesToStop) {
		this.minutesToStop = minutesToStop;
	}

	public Date getStopDate() {
		return stopDate;
	}

	public void setStopDate(Date stopDate) {
		this.stopDate = stopDate;
	}

	public Integer getTemp() {
		return temp;
	}

	public void setTemp(Integer temp) {
		this.temp = temp;
	}

	public Integer getLastHourTemp() {
		return lastHourTemp;
	}

	public void setLastHourTemp(Integer lastHourTemp) {
		this.lastHourTemp = lastHourTemp;
	}

	public Integer getLastFourHourTemp() {
		return lastFourHourTemp;
	}

	public void setLastFourHourTemp(Integer lastFourHourTemp) {
		this.lastFourHourTemp = lastFourHourTemp;
	}

	public Integer getRain() {
		return rain;
	}

	public void setRain(Integer rain) {
		this.rain = rain;
	}

	public Integer getLastHourRain() {
		return lastHourRain;
	}

	public void setLastHourRain(Integer lastHourRain) {
		this.lastHourRain = lastHourRain;
	}

	public Integer getLastFourHourRain() {
		return lastFourHourRain;
	}

	public void setLastFourHourRain(Integer lastFourHourRain) {
		this.lastFourHourRain = lastFourHourRain;
	}

	public Integer getSnow() {
		return snow;
	}

	public void setSnow(Integer snow) {
		this.snow = snow;
	}

	public Integer getLastHourSnow() {
		return lastHourSnow;
	}

	public void setLastHourSnow(Integer lastHourSnow) {
		this.lastHourSnow = lastHourSnow;
	}

	public Integer getLastFourHourSnow() {
		return lastFourHourSnow;
	}

	public void setLastFourHourSnow(Integer lastFourHourSnow) {
		this.lastFourHourSnow = lastFourHourSnow;
	}

	public Integer getWind() {
		return wind;
	}

	public void setWind(Integer wind) {
		this.wind = wind;
	}

	public Integer getLastHourWind() {
		return lastHourWind;
	}

	public void setLastHourWind(Integer lastHourWind) {
		this.lastHourWind = lastHourWind;
	}

	public Integer getLastFourHourWind() {
		return lastFourHourWind;
	}

	public void setLastFourHourWind(Integer lastFourHourWind) {
		this.lastFourHourWind = lastFourHourWind;
	}

	public Integer getHoliday() {
		return holiday;
	}

	public void setHoliday(Integer holiday) {
		this.holiday = holiday;
	}

	public Integer getFutureHoliday() {
		return futureHoliday;
	}

	public void setFutureHoliday(Integer futureHoliday) {
		this.futureHoliday = futureHoliday;
	}

	public Integer getPastHoliday() {
		return pastHoliday;
	}

	public void setPastHoliday(Integer pastHoliday) {
		this.pastHoliday = pastHoliday;
	}

	public Integer getFutureHolidayThreeDays() {
		return futureHolidayThreeDays;
	}

	public void setFutureHolidayThreeDays(Integer futureHolidayThreeDays) {
		this.futureHolidayThreeDays = futureHolidayThreeDays;
	}

	public Integer getPastHolidayThreeDays() {
		return pastHolidayThreeDays;
	}

	public void setPastHolidayThreeDays(Integer pastHolidayThreeDays) {
		this.pastHolidayThreeDays = pastHolidayThreeDays;
	}

	public Integer getPrevBusBehind() {
		return prevBusBehind;
	}

	public void setPrevBusBehind(Integer prevBusBehind) {
		this.prevBusBehind = prevBusBehind;
	}

	public Integer getNextBusAhead() {
		return nextBusAhead;
	}

	public void setNextBusAhead(Integer nextBusAhead) {
		this.nextBusAhead = nextBusAhead;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getTrafficFreewayN() {
		return trafficFreewayN;
	}

	public void setTrafficFreewayN(Integer trafficFreewayN) {
		this.trafficFreewayN = trafficFreewayN;
	}

	public Integer getTrafficFreewayE() {
		return trafficFreewayE;
	}

	public void setTrafficFreewayE(Integer trafficFreewayE) {
		this.trafficFreewayE = trafficFreewayE;
	}

	public Integer getTrafficFreewayW() {
		return trafficFreewayW;
	}

	public void setTrafficFreewayW(Integer trafficFreewayW) {
		this.trafficFreewayW = trafficFreewayW;
	}

	public Integer getTrafficFreewayS() {
		return trafficFreewayS;
	}

	public void setTrafficFreewayS(Integer trafficFreewayS) {
		this.trafficFreewayS = trafficFreewayS;
	}

}
