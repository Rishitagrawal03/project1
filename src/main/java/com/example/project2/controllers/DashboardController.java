//package com.example.project2.controllers;
//
//import org.apache.hc.core5.http.HttpStatus;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.project2.DTOs.ApiResponse;
//import com.example.project2.services.Project1Client;
//
//import com.example.project2.services.UserServiceClient;
//
//@RestController
//@RequestMapping
//@CrossOrigin("*")
//public class DashboardController {
//
//
//	@Autowired
//	private Project1Client client;
//	
//
//
//	  @GetMapping("/service1")
//	    public ApiResponse<String> callService1() {
//
//		  String data = client.getHello();
//
//	        ApiResponse<String> response = new ApiResponse<>();
//
//	        if ("FALLBACK".equals(data)) {
//	            response.setSuccess(false);
//	            response.setMessage("Service-1 is currently unavailable (fallback)");
//	            response.setData(null);
//	        } else {
//	            response.setSuccess(true);
//	            response.setMessage("Success");
//	            response.setData(data);
//	        }
//	        return response;
//	    }
//
//	
//	public ResponseEntity<ApiResponse<String>> serviceFallback(RuntimeException ex) {
//
//	    ApiResponse<String> response = new ApiResponse<>();
//	    response.setSuccess(false);
//	    response.setMessage("Service-1 is currently unavailable (fallback)");
//	    response.setData(null);
//
//	    return ResponseEntity
//	            .status(HttpStatus.SC_SERVICE_UNAVAILABLE)
//	            .body(response);
//	}
//
//
//}
