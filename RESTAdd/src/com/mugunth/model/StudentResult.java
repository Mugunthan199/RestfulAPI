package com.mugunth.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Student")
public class StudentResult {

	public StudentResult() {
		// TODO Auto-generated constructor stub
	}
	Student studentdetails;
	private String status;
	public Student getStudentdetails() {
		return studentdetails;
	}
	public void setStudentdetails(Student studentdetails) {
		this.studentdetails = studentdetails;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
