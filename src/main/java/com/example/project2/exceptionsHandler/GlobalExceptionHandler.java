package com.example.project2.exceptionsHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.project2.DTOs.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse<String>> handleGenericException(Exception ex){
		ApiResponse<String> response = new ApiResponse<>();
		response.setData(null);
		response.setMessage("Internal error occured. Please try again later.");
		response.setSuccess(false);
		
		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
		
		
	}
}
