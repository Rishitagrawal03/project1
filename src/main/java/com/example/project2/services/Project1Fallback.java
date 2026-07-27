package com.example.project2.services;

import org.springframework.stereotype.Component;

@Component
public class Project1Fallback implements Project1Client {

    @Override
	 public String getHello() {
	        return "Feign fallback response";
	    }
}
