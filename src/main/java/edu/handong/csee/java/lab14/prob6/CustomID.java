package edu.handong.csee.java.lab14.prob6;
import java.util.Scanner;

public class CustomID extends Exception {
	private String name;
	private String race;
	private int age;
	String raceType[]= {"Vulcan", "Romulan", "Klingons"};
	Scanner keyboard = new Scanner(System.in);

	public void setName() throws Exception {
		while(true) {
			System.out.print("Enter your name: ");
			name = keyboard.nextLine();
			if(name.length() < 5) {
				throw new Exception("Your name is short! Try again!");
			}
			else {
				System.out.println("Name is valid");
				System.out.println("Name: " + name);
				break;
			}
		}
	}

	public void setRace() throws Exception{
		while(true) {
			System.out.print("Enter your race: ");
			race = keyboard.nextLine();	
			for(int i = 0; i < raceType.length; i++)
			{
				if(raceType[i].equals(race)) {
					this.race = raceType[i];
					System.out.println("Race is valid");
					System.out.println("Race: " + raceType[i]);
					return;
				}

			}
			throw new Exception("Human! Try again.");
		}
	}

	public void setAge() throws Exception{
		while(true) {
			System.out.print("Enter your age: ");
			age = keyboard.nextInt();
			if(age < 18) {
				throw new Exception("You are too young! Try again!");
			}
			else {
				System.out.println("Age is valid");
				System.out.println("Age: " + age);
				keyboard.nextLine();
				break;
			}
		}
	}	
}



