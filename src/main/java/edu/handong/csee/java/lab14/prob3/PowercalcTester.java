package edu.handong.csee.java.lab14.prob3; //package name
import java.util.Scanner; //import standard input from keyboard

public class PowercalcTester { //declare PowercalcTester class
	public static void main(String[] args) { //declare main method
		Scanner keyboard = new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
		Powercalc myCalculator= new Powercalc(); //// instantiate powercalc class to myCalculator

		do { //do loop
			int n = keyboard.nextInt(); //store input(keyboard) in n
			int p = keyboard.nextInt(); //store input(keyboard) in p
			try { //start
				System.out.println(myCalculator.power(n,p));//print(power method's return variable
			} catch (Exception e) {//if it catch Exception 
				System.out.println(e); //print error 
			}

		}while(keyboard.hasNextInt());	 //if input is int type , loop again
	}
}
