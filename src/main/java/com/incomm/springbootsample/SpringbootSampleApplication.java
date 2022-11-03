package com.incomm.springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource({"file:/opt/incomm-simplespringboot/config/testspringboot.properties" })
@SpringBootApplication
public class SpringbootSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSampleApplication.class, args);
	}
}
