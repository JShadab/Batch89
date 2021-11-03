package com.shad.model;

public class Engine {

	private String power;

	public Engine(String power) {
		this.power = power;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public void display() {
		System.out.println("Engine has power " + power);

	}

}
