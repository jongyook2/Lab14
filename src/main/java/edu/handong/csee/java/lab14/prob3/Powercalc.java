package edu.handong.csee.java.lab14.prob3;

public class Powercalc {
	static int n, p;
	public static int getN() {
		return n;
	}
	public static int getP() {
		return p;
	}

	public Powercalc() {

	}
	public long power(int n, int p) throws Exception {

		long number=(long)Math.pow(n, p);
		if(n<0 || p<0) {
			throw new Exception("n or p should not be nagative.");
		}
		if(n==0 && p==0) {
			throw new Exception("n and p should not be zero.");
		}
		return number;
	}
}
