package com.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shad.model.Laptop;

public class Test {

	public static void main(String[] args) {

		// IoC Container or Spring Container
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Laptop laptop = context.getBean("laptop", Laptop.class);
		laptop.boot();

	}

}
