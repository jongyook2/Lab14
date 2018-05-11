package edu.handong.csee.java.lab14.prob1; //package name
import java.util.Scanner; //import standard input from keyboard
import java.util.Random; //import Random util(generate random)

public class SpeedLimiter { //declare class
	int speedLimit; //declare instance variable(int speedLimit)
	int yourSpeed; //declare instance variable(int yourSpeed)
	public int getSpeedLimit() { //declare getter of speedLimit
		return speedLimit; //return speedLimit
	}
	public void setSpeedLimit(int speedLimit) { //declare setter of speedLimit
		this.speedLimit = speedLimit; //store speedLimit in this.speedLimit
	}
	public int getYourSpeed() { //declare getter of YourSpeed
		return yourSpeed; //return yourSpeed
	}
	public void setYourSpeed(int yourSpeed) { //declare setter of speedLimit
		this.yourSpeed = yourSpeed; //store yourSpeed in this.yourSpeed
	}

	public SpeedLimiter() { //Constructor
		Scanner keyboard = new Scanner(System.in); // instantiate Class Scanner to keyboard(input)
		Random random = new Random(); //instantiate Class Random to random
		System.out.print("Set the speed limit, officer: "); //print(Set the speed limit, officer:)
		speedLimit = keyboard.nextInt();//store input(keyboard) in speedLimit
		yourSpeed = random.nextInt(101); //store random number(0~100) in yourSpeed
	}
	public void warnSpeedLimit(int speedLimit, int yourSpeed) { //declare warn method(speed over)
		try { //start
			if(speedLimit < yourSpeed) { //if speedLimit is lower than yourSpeed
				throw new Exception("Speed Limit "+speedLimit+"km exceeded!"); //throw new Exception and print
			}
			System.out.println("you are a law abiding citizen!");//print(you are a law abiding citizen!)
		}
		catch(Exception e) { //if it catches exception
			System.out.println(e.getMessage()); //print exception's message
			System.out.println("You are being fined");//print(You are being fined)
		}
		System.out.println("Your current speed: "+ yourSpeed);//print(Your current speed:)
	}
}

