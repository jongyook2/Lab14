package edu.handong.csee.java.lab14.prob5; //package name

public class MyException extends Exception { //declare MyException class and inherits Exception 
	private String message; //declare instance variable message 

	public MyException(String string) { //Constructor
		super(string); //call parent's Constructor
		message=string; //store string in message
	}
	public String toString() { //declare toString method
		return message; //return message
	}
}
