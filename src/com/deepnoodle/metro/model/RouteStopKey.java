package com.deepnoodle.metro.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
//Composite key for RouteStop
public class RouteStopKey implements Serializable {

	private static final long serialVersionUID = 1L;

	private String routeId;
	private String stopId;

	public RouteStopKey() {
		//default constructor for hibernate
	}

	public RouteStopKey(String routeId, String stopId) {
		this.routeId = routeId;
		this.stopId = stopId;
	}

	public String getRouteId() {
		return routeId;
	}

	public String getStopId() {
		return stopId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((routeId == null) ? 0 : routeId.hashCode());
		result = prime * result + ((stopId == null) ? 0 : stopId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RouteStopKey other = (RouteStopKey) obj;
		if (routeId == null) {
			if (other.routeId != null)
				return false;
		} else if (!routeId.equals(other.routeId))
			return false;
		if (stopId == null) {
			if (other.stopId != null)
				return false;
		} else if (!stopId.equals(other.stopId))
			return false;
		return true;
	}

}
