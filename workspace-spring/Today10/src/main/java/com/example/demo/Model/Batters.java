package com.example.demo.Model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Batters {

	private List<Batter> batter = new ArrayList<Batter>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Batters() {
	}

	/**
	 *
	 * @param batter
	 */
	public Batters(List<Batter> batter) {
		super();
		this.batter = batter;
	}

	public List<Batter> getBatter() {
		return batter;
	}

	public void setBatter(List<Batter> batter) {
		this.batter = batter;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Batters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("batter");
		sb.append('=');
		sb.append(((this.batter == null) ? "<null>" : this.batter));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}