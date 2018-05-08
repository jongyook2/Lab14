package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception {
	private String message;

	public MyException(String string) {
		super(string);
		message=string;
	}
	public String toString() {
		return message;
	}
}
