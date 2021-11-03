package com.shad.model;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike {

	public void start() {
		System.out.println("Bike is running from Spring using Annotation");
	}

}
