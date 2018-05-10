package edu.handong.csee.java.lab14.prob6; //package name

public class CustomTester { //declare CustomTester
	public static void main(String[] args) { //declare main method
		CustomID customID = new CustomID(); //instantiate customID class to customID(instance)
		int i=0; //declare variable i and initiate to 0
		while(i<3) { //loop until i is lower than 3
			try { //start
				if(i==0) { //if i equals to 0
					customID.setName(); //call setName method
					i++;} //increase 1
				if(i==1) { //if i equals to 1
					customID.setAge(); //call setAge method
					i++;} //increase 1
				if(i==2) { //if i equals to 2
					customID.setRace(); //call setRace method
					i++;} //increase 1
			} catch(Exception e) { //if catch Exception
				System.out.println(e.getMessage()); //print error message
				continue; //loop again
			}
		}
	}
}

