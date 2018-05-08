package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner;

public class PowercalcTester {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Powercalc my_calculator= new Powercalc();

		do {
			int n = keyboard.nextInt();
			int p = keyboard.nextInt();
			try {
				System.out.println(my_calculator.power(n,p));
			} catch (Exception e) {
				System.out.println(e);
			}

		}while(keyboard.hasNextInt());	

	}
}
