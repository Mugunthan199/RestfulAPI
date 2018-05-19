package com.mugunth.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Addition")
public class Add {

	public Add() {
		// TODO Auto-generated constructor stub
	}
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	

}
