package edu.handong.csee.java.lab14.prob1; //package name

public class SpeedLimiterMain { //declare SpeedLimiterMain class
	public static void main(String[] args) { //declare main method
		SpeedLimiter speedLimiter = new SpeedLimiter(); //instantiate speedLimiter class to speedLimiter(instance)
		SpeedLimiter.warnSpeedLimit(speedLimiter.getSpeedLimit(), speedLimiter.getYourSpeed()); //call warnSpeedLimit method
	}
}
