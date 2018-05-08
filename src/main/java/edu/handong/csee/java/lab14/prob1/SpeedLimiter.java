package edu.handong.csee.java.lab14.prob1;
import java.util.Scanner;
import java.util.Random;

public class SpeedLimiter {
	int speedLimit;
	int yourSpeed;
	public int getSpeedLimit() {
		return speedLimit;
	}
	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}
	public int getYourSpeed() {
		return yourSpeed;
	}
	public void setYourSpeed(int yourSpeed) {
		this.yourSpeed = yourSpeed;
	}

	public SpeedLimiter() {
		Scanner keyboard = new Scanner(System.in);
		Random Random = new Random();
		System.out.print("Set the speed limit, officer: ");
		speedLimit = keyboard.nextInt();
		yourSpeed = Random.nextInt(101);
	}
	public static void warnSpeedLimit(int speedLimit, int yourSpeed) {
		try {
			if(speedLimit < yourSpeed) {
				throw new Exception("Speed Limit "+speedLimit+"km exceeded!");
			}
			System.out.println("you are a law abiding citizen!");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("You are being fined");
		}
		System.out.println("Your current speed: "+ yourSpeed);
	}
}

