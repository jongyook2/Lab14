package edu.handong.csee.java.lab14.prob6; //package name
import java.util.Scanner; //import standard input from keyboard

public class CustomID extends Exception { //declare CustomID class and inherits Exception
	private String name; //declare instance variable name
	private String race; //declare instance variable race
	private int age; //declare instance variable age
	String raceType[]= {"Vulcan", "Romulan", "Klingons"}; //declare raceType array and store 3 races
	Scanner keyboard = new Scanner(System.in); // instantiate Class Scanner to keyboard(input)

	public void setName() throws Exception { //declare setter method and throws Exception
		while(true) { //loop
			System.out.print("Enter your name: "); //print(Enter your name: )
			name = keyboard.nextLine(); //store input(keyboard) in name
			if(name.length() < 5) { //if name's length is lower than 5
				throw new Exception("Your name is short! Try again!"); //throws new Exception and print(Your name is short! Try again!)
			}
			else { //if not
				System.out.println("Name is valid"); //print(Name is valid)
				System.out.println("Name: " + name); //print(Name: name(input)
				break; //exit from loop
			}
		}
	}

	public void setRace() throws Exception{ //declare setter method and throws Exception
		while(true) { //loop
			System.out.print("Enter your race: "); //print(Enter your race:)
			race = keyboard.nextLine();	//store input(keyboard) in race
			for(int i = 0; i < raceType.length; i++) //for loop (0 to raceType's length-1)
			{
				if(raceType[i].equals(race)) { //if raceType equals to race(input)
					System.out.println("Race is valid"); //print(Race is valid)
					System.out.println("Race: " + raceType[i]); //print(Race: raceType[i]'s value
					return; //exit from loop
				}
			}
			throw new Exception("Human! Try again.");//if race mismatches to type race. throws new Exception and print(Human! Try again.)
		}
	}

	public void setAge() throws Exception{ //declare setter method and throws Exception
		while(true) { //loop
			System.out.print("Enter your age: "); //print(Enter your age:)
			age = keyboard.nextInt(); //store input(keyboard) in age
			if(age < 18) { //if age is lower than 18
				throw new Exception("You are too young! Try again!"); //throws new Exception and print(You are too young! Try again!)
			}
			else { //if not
				System.out.println("Age is valid"); //print(Age is valid)
				System.out.println("Age: " + age); //print(Age: age(input)
				keyboard.nextLine(); //like flush buffer
				break; //exit from loop
			}
		}
	}	
}



