package com.shad.model;

import org.springframework.stereotype.Component;

@Component("intel")
//@Primary
public class IntelProcessor implements Processor {

	@Override
	public void doProcessing() {
		System.out.println("Intel i9 processor is running");
		
	}

}
