package edu.handong.csee.java.lab14.prob3;//package name

public class PowerCalculator { //declare Powercalc class
	static int n, p; //declare static variable n,p
	public static int getN() { //declare static getter method
		return n; // return n
	}
	public static int getP() { //declare static getter method
		return p; //return p
	}

	public PowerCalculator() { //Constructor

	}
	public long power(int n, int p) throws Exception { //declare power method and throws Exception

		long number=(long)Math.pow(n, p); //declare local variable number , store n^p in number
		if(n<0 || p<0) { // if  n and p are lower than 0
			throw new Exception("n or p should not be negative."); //throw new Exception and print(n or p should not be negative.)
		}
		if(n==0 && p==0) { //if n and p equal to 0
			throw new Exception("n and p should not be zero."); //throw new Exception and print(n and p should not be zero.)
		}
		return number; //else return number
	}
}
