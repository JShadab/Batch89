package com.shad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shad.model.Engine;

@Configuration
@ComponentScan(basePackages = "com.shad")
public class SpringConfig {

	@Bean
	public Engine getEngine() {
		return new Engine("3000 CC");
	}

}
