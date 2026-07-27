package com.example.project2.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "project1", fallback = Project1Fallback.class) 
public interface Project1Client {
	
    @GetMapping("/hello")     
    String getHello();
}
