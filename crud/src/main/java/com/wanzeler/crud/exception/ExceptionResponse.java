package com.wanzeler.crud.exception;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse implements Serializable{
	
	public ExceptionResponse(Date date, String message2, String description) {
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String message;
	private String details;

}
