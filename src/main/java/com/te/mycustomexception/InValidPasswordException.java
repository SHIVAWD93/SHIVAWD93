package com.te.mycustomexception;

public class InValidPasswordException extends RuntimeException {

	public InValidPasswordException(String msg) {
		super(msg);
	}

}
