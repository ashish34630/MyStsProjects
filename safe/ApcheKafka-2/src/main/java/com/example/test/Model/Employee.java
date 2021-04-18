package com.example.test.Model;

public class Employee {
 
    private Integer id;
    private String name;
	public Integer getId() {
		return id;
	}
	public void ListId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void ListName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}