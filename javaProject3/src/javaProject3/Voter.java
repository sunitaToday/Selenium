package javaProject3;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to check age - eligibility of person apply for voter id 18+
		//Print: You are eligible
		//You are not eligible.
		
		int age = 23;
		if(age >= 18){
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}
		
	}

}
