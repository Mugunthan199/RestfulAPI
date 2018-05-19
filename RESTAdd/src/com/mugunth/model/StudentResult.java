package com.mugunth.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Student")
public class StudentResult {

	public StudentResult() {
		// TODO Auto-generated constructor stub
	}
	Student s;
	private String status;
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
