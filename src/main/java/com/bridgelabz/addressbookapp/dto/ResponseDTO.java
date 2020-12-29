package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

/*Lombok is an annotation processor - it has full access to the
 * generated source tree. While annotation processors usually generate
 * new source files, Lombok modifies existing Class by adding new fields
 * or methods.
 */
public @Data class ResponseDTO {
	private String message;
	private Object data;

	public ResponseDTO(String message, Object data) {
		this.message = message;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}