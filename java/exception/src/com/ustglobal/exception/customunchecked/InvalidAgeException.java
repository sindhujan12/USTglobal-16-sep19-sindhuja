package com.ustglobal.exception.customunchecked;

public class InvalidAgeException extends RuntimeException{
	
	String msg ="invalid age";
	public String getMsg() {
		return msg;
	}

}
