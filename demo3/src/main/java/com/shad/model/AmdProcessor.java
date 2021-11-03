package com.shad.model;

import org.springframework.stereotype.Component;

@Component("amd")
public class AmdProcessor implements Processor {

	@Override
	public void doProcessing() {
		System.out.println("AMD processor is running");
		
	}

}
