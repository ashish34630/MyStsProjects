package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Alien {
	@Autowired
	private Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	private int aid;
	public Alien() {
		super();
		System.out.println("I am getting created here");
	}
	public Alien(int aid, String name, String tech) {
		super();
		this.aid = aid;
		this.name = name;
		this.tech = tech;
	}

	private String name;
	private String tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public void show()
	{
		System.out.println("The object is getting created");
		laptop.compile();
	}

}
