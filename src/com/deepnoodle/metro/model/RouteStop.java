package com.deepnoodle.metro.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.deepnoodle.model.IsEntity;
import com.deepnoodle.model.IsJson;

@Entity
@Table(name = "RouteStop")
public class RouteStop implements IsEntity, IsJson {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RouteStopKey key;

	private Integer stopPosition;

	public RouteStop() {
		//default constructor for hibernate
	}

	public RouteStop(RouteStopKey key) {
		this.key = key;
	}

	public RouteStop(String routeId, String stopId, int stopPosition) {
		key = new RouteStopKey(routeId, stopId);
		this.stopPosition = stopPosition;
	}

	public Integer getStopPosition() {
		return stopPosition;
	}

	public void setStopPosition(Integer stopPosition) {
		this.stopPosition = stopPosition;
	}

}
