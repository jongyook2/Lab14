package edu.handong.csee.java.lab14.prob4; //package name
import java.util.Scanner; //import standard input from keyboard

public class Boundary { //declare Boundary class
	int numberArray[]=new int[5]; // declare numberArray[5]
	public void saveNumber() { //declare saveNumber method
		Scanner keyboard = new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
		int i=0; //declare variable i and initiate to 0
		while(true) { //loop 
			System.out.print("Enter an integer: "); //print(Enter an integer:)
			numberArray[i]=keyboard.nextInt(); //store input(keyboard) in numberArray[i]
			System.out.println("arr["+i+"] <- "+numberArray[i]); //print(arr[i]<-numberArray[i]'s value
			i++;//increase 1
		}	
	}
}
