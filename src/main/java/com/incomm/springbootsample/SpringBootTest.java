package com.incomm.springbootsample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
@Configuration
@EnableCaching
@RefreshScope
public class SpringBootTest {
	
	private static Logger log = LogManager.getLogger(SpringBootTest.class);
	
	@Value("${spring.message1}")
	private String message1;
	
	@Value("${spring.message2}")
	private String message2;
	
	@Value("${spring.message3}")
	private String message3;
	
	@Value("${spring.message4}")
	private String message4;
	
	@Value("${fsapi.password}") 
	private String message5;
	 
	
	@GetMapping(value="/status")
    public String status(HttpServletRequest request,HttpServletResponse response) throws Exception {
		log.info("Inside status()");
		return "SpringBootTest status() is up and running";
	}
	
	@GetMapping(value="/ping")
    public String ping(HttpServletRequest request,HttpServletResponse response) throws Exception {
		log.info("Inside ping()");
		return "SpringBootTest ping() is up and running";
	}
	
	@GetMapping(value="/check")
    public String check(HttpServletRequest request,HttpServletResponse response) throws Exception {
		log.info("Inside check()");
		return message1+" "+message2+" "+message3+" "+message4+" "+message5;
	}
	
}
