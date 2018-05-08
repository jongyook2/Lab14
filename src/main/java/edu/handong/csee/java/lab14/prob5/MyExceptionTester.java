package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;

public class MyExceptionTester {
	public static void main(String[] args){
		try{
			Scanner keyboard = new Scanner(System.in);
			String str = keyboard.nextLine();
			MyExceptionTester.myTest(str);
		} catch(MyException mae){
			System.out.println("Inside catch block: " + mae);
		}
	}

	static void myTest(String ms) throws MyException{
		if(ms.equals("null")){
			throw new MyException("String val is null");
		}
		else
			System.out.println("String val is:" + ms);
	}

}
