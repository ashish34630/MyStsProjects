package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int lid;
	private String brand;
	public Laptop(int lid, String brand) {
		super();
		this.lid = lid;
		this.brand = brand;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void compile()
	{
		System.out.println("I am compiling");
	}

}
