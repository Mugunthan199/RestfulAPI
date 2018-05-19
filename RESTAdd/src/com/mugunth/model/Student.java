package com.mugunth.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Student")
public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	private int regno;
	private String name;
	private int totalmarks;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	
}
