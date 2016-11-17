
package com.deepnoodle.metro.model;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StopsForRouteData implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("entry")
	@Expose
	private Entry entry;

	@SerializedName("references")
	@Expose
	private References references;

	/**
	 * 
	 * @return
	 *     The entry
	 */
	public Entry getEntry() {
		return entry;
	}

	/**
	 * 
	 * @param entry
	 *     The entry
	 */
	public void setEntry(Entry entry) {
		this.entry = entry;
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
