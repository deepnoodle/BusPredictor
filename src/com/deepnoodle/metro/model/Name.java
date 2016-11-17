
package com.deepnoodle.metro.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.deepnoodle.model.IsJson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Name implements IsJson {
	private static final long serialVersionUID = 1L;

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("names")
	@Expose
	private List<String> names = new ArrayList<String>();
	@SerializedName("type")
	@Expose
	private String type;

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

	/**
	 * 
	 * @return
	 *     The names
	 */
	public List<String> getNames() {
		return names;
	}

	/**
	 * 
	 * @param names
	 *     The names
	 */
	public void setNames(List<String> names) {
		this.names = names;
	}

	/**
	 * 
	 * @return
	 *     The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *     The type
	 */
	public void setType(String type) {
		this.type = type;
	}

}
