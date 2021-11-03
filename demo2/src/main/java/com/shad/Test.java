package com.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shad.model.Bike;
import com.shad.model.Car;

public class Test {

	public static void main(String[] args) {

		// IoC Container or Spring Container
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Car car = (Car) context.getBean("car");
		car.start();

		Bike bike = (Bike) context.getBean("bike");
		bike.start();

	}

}
