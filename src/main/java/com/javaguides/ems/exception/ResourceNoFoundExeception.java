package com.javaguides.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNoFoundExeception extends RuntimeException {
	
	public ResourceNoFoundExeception(String message) {
		super(message);
	}

}
