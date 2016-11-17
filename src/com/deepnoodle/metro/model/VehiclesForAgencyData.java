
package com.deepnoodle.metro.model;

import java.util.ArrayList;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VehiclesForAgencyData implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("limitExceeded")
	@Expose
	private Boolean limitExceeded;
	@SerializedName("list")
	@Expose
	private java.util.List<VehicleStatus> list = new ArrayList<VehicleStatus>();
	@SerializedName("outOfRange")
	@Expose
	private Boolean outOfRange;
	@SerializedName("references")
	@Expose
	private References references;

	/**
	 * 
	 * @return
	 *     The limitExceeded
	 */
	public Boolean getLimitExceeded() {
		return limitExceeded;
	}

	/**
	 * 
	 * @param limitExceeded
	 *     The limitExceeded
	 */
	public void setLimitExceeded(Boolean limitExceeded) {
		this.limitExceeded = limitExceeded;
	}

	/**
	 * 
	 * @return
	 *     The list
	 */
	public java.util.List<VehicleStatus> getList() {
		return list;
	}

	/**
	 * 
	 * @param list
	 *     The list
	 */
	public void setList(java.util.List<VehicleStatus> list) {
		this.list = list;
	}

	/**
	 * 
	 * @return
	 *     The outOfRange
	 */
	public Boolean getOutOfRange() {
		return outOfRange;
	}

	/**
	 * 
	 * @param outOfRange
	 *     The outOfRange
	 */
	public void setOutOfRange(Boolean outOfRange) {
		this.outOfRange = outOfRange;
	}

	/**
	 * 
	 * @return
	 *     The references
	 */
	public References getReferences() {
		return references;
	}

	/**
	 * 
	 * @param references
	 *     The references
	 */
	public void setReferences(References references) {
		this.references = references;
	}

}
