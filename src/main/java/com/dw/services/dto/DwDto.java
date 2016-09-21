package com.dw.services.dto;

import java.util.Collections;
import java.util.List;

public class DwDto {
	private List<String> errors = Collections.emptyList();
	private String message;

	public DwDto setErrors(List<String> errors) {
		this.errors = errors;
		return this;
	}

	public DwDto setMessage(String message) {
		this.message = message;
		return this;
	}

	public List<String> getErrors() {
		return errors;
	}

	public String getMessage() {
		return message;
	}
}
