package edu.handong.csee.java.lab14.prob2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception {
	int x, y;
	public static void checkError() {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("x: ");
			int x = keyboard.nextInt();
			System.out.print("y: ");
			int y = keyboard.nextInt();
			System.out.println(x/y);
		} catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch(ArithmeticException e) {
			System.out.println("java.util.ArithmeticException: "+e.getMessage());
		} catch(Exception e ) {
			System.out.println("Some other exception has occured: "+e.getMessage());
		}
	}
}