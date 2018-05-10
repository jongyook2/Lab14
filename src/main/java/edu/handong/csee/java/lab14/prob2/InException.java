package edu.handong.csee.java.lab14.prob2; //package name
import java.util.InputMismatchException; //import InputMismathException(type of Exception)
import java.util.Scanner; //import standard input from keyboard

public class InException { //declare InException class
	int x, y; //declare instance variable x, y
	public static void checkError() { //declare checkError method
		try { //start
			Scanner keyboard = new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
			System.out.print("x: "); //print(x: )
			int x = keyboard.nextInt(); //store input(keyboard) in x
			System.out.print("y: "); //print(y: )
			int y = keyboard.nextInt(); //store input(keyboard) in y
			System.out.println(x/y); //print(x is divided by y)
		} catch(InputMismatchException e) { //if catch InputMismatchException 
			System.out.println("java.util.InputMismatchException"); //print(java.util.InputMismatchException)
		} catch(ArithmeticException e) { //if catch ArithmeticException
			System.out.println("java.util.ArithmeticException: "+e.getMessage());//print(java.util.ArithmeticException: + error message)
		} catch(Exception e ) { //if catch Exception(other) 
			System.out.println("Some other exception has occured: "+e.getMessage());//print(Some other exception has occured: + error message)
		}
	}
}