package edu.handong.csee.java.lab14.prob4;

public class BoundaryTester {
	public static void main(String[] args) {
		Boundary boundary = new Boundary();
		try {
			boundary.saveNumber();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index access!");
		}
	}
}