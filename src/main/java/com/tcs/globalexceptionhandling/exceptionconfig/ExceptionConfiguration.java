package com.tcs.globalexceptionhandling.exceptionconfig;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tcs.globalexceptionhandling.customexception.StudentException;

@ControllerAdvice
public class ExceptionConfiguration extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return new ResponseEntity<Object>("Method Not allowed", HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<Object> handleCustomException(StudentException exception){
		return new ResponseEntity<Object>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}

}
