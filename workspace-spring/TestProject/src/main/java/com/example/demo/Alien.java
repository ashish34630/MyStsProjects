package com.example.demo;

public class Alien {
	private int aid;
	private String aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Alien(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	

}
