package com.example.demo.Model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

public class Example {

	private String id;
	private String type;
	private String name;
	private Double ppu;
	private Batters batters;
	private List<Topping> topping = new ArrayList<Topping>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Example() {
	}

	/**
	 *
	 * @param ppu
	 * @param batters
	 * @param name
	 * @param id
	 * @param type
	 * @param topping
	 */
	public Example(String id, String type, String name, Double ppu, Batters batters, List<Topping> topping) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.ppu = ppu;
		this.batters = batters;
		this.topping = topping;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPpu() {
		return ppu;
	}

	public void setPpu(Double ppu) {
		this.ppu = ppu;
	}

	public Batters getBatters() {
		return batters;
	}

	public void setBatters(Batters batters) {
		this.batters = batters;
	}

	public List<Topping> getTopping() {
		return topping;
	}

	public void setTopping(List<Topping> topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Example.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("type");
		sb.append('=');
		sb.append(((this.type == null) ? "<null>" : this.type));
		sb.append(',');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null) ? "<null>" : this.name));
		sb.append(',');
		sb.append("ppu");
		sb.append('=');
		sb.append(((this.ppu == null) ? "<null>" : this.ppu));
		sb.append(',');
		sb.append("batters");
		sb.append('=');
		sb.append(((this.batters == null) ? "<null>" : this.batters));
		sb.append(',');
		sb.append("topping");
		sb.append('=');
		sb.append(((this.topping == null) ? "<null>" : this.topping));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}