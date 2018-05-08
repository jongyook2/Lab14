package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner;

public class Boundary {
	int numberArray[]=new int[5];
	public void saveNumber() {
		Scanner keyboard = new Scanner(System.in);
		int i=0;
		while(true) {
		System.out.print("Enter an interger: ");
		numberArray[i]=keyboard.nextInt();
		System.out.println("arr["+i+"] <- "+numberArray[i]);
		i++;
		}	
	}
}
