package edu.handong.csee.java.lab14.prob4; //package name

public class BoundaryTester { //declare BoundaryTester class
	public static void main(String[] args) {//declare main method
		Boundary boundary = new Boundary(); //instantiate Boundary class to boundary(instance)
		try {//start
			boundary.saveNumber();//call saveNumber method
		} catch(ArrayIndexOutOfBoundsException e) {//if catch ArrayIndexOutOfBoundsException
			System.out.println("Invalid array index access!"); //print(Invalid array index access!)
		}
	}
}