package com.tcs.globalexceptionhandling.customexception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentException extends RuntimeException{
	private String message;

	public StudentException(String message) {
		super(message);
	}
	
}
