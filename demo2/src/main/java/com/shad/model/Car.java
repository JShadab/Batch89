package com.shad.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {

	@Autowired
	private Engine engine;
	
	@Autowired
	private Tyre tyre;

	public void start() {
		System.out.println("Car is running from Spring using Annotation");
		engine.display();
		System.out.println(tyre);
	}

}
