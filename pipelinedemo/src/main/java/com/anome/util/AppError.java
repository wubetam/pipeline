package com.anome.util;

public class AppError extends Exception {

	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public AppError(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
