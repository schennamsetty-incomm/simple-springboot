package com.incomm.springbootsample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootTest {
	
	@GetMapping(value="/")
    public String status(HttpServletRequest request,HttpServletResponse response) throws Exception {
		return "SpringBootTest Service is up and running";
	}
	
	@GetMapping(value="/ping")
    public String ping(HttpServletRequest request,HttpServletResponse response) throws Exception {
		return "SpringBootTest ping() is up and running";
	}

}
