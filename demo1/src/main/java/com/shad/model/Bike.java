package com.shad.model;

public class Bike {

	private String company;

	public Bike(String company) {
		this.company = company;
	}

	public void start() {
		System.out.println("Bike is running from Spring COMPANY: "+company);
	}

}
