package com.devsuperior.dslearnbds.resources.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthCustomError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String error;
	@JsonProperty("error_description")
	private String descriptionError;
	
	public OAuthCustomError() {
		
	}

	public OAuthCustomError(String error, String descriptionError) {
		this.error = error;
		this.descriptionError = descriptionError;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getDescriptionError() {
		return descriptionError;
	}

	public void setDescriptionError(String descriptionError) {
		this.descriptionError = descriptionError;
	}
	
	

}
