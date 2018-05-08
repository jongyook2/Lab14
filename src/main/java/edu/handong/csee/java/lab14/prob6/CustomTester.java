package edu.handong.csee.java.lab14.prob6;

public class CustomTester {
	public static void main(String[] args) {
		CustomID customID = new CustomID();
		int i=0;
		while(i<3) {
			try {
				if(i==0) {
					customID.setName();
					i++;}
				if(i==1) {
					customID.setAge();
					i++;}
				if(i==2) {
					customID.setRace();
					i++;}
			} catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
}

