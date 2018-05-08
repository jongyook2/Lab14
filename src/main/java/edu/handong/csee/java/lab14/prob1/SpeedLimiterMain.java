package edu.handong.csee.java.lab14.prob1;

public class SpeedLimiterMain {
	public static void main(String[] args) {
		SpeedLimiter speedLimiter = new SpeedLimiter();
		SpeedLimiter.warnSpeedLimit(speedLimiter.getSpeedLimit(), speedLimiter.getYourSpeed());		
	}
}
