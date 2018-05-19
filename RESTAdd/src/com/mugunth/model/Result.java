package com.mugunth.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SUM")
public class Result {

	public Result() {
		// TODO Auto-generated constructor stub
	}
	
	private int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	

}
