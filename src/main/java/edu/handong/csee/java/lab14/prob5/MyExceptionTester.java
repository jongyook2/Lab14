package edu.handong.csee.java.lab14.prob5; //package name
import java.util.Scanner; //import standard input from keyboard

public class MyExceptionTester { //declare MyExceptionTester class
	public static void main(String[] args){ //declare main method
		try{ //start
			Scanner keyboard = new Scanner(System.in); //instantiate Class Scanner to keyboard(input)
			String inputStr = keyboard.nextLine(); //store input(keyboard) in inputStr
			MyExceptionTester.myTest(inputStr); //call myTest(inputStr) method
		} catch(MyException mae){ //if catch MyException
			System.out.println("Inside catch block: " + mae); //print(inside catch block: + error message(String val is null) at null
		}
	}

	static void myTest(String myTestStr) throws MyException{ //declare myTest method and throws MyException
		if(myTestStr.equals("null")){//if myTestStr equals to null
			throw new MyException("String val is null"); //throw new MyException->print(String val is null)
		}
		else //if not
			System.out.println("String val is: " + myTestStr); //print String val is myTestSTr(input from keyboard)
	}
}
