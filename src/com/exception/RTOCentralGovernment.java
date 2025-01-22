package com.exception;

import java.util.Scanner;

class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		return"You underage getmessage() wala";
	}
}
class OverAgeException extends Exception{
	@Override
	public String getMessage() {
		return"You Overage getmessage() wala";
	}
}


class Rto{
	private int age;
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age");
		age = scan.nextInt();
	}
	public void verify() throws UnderAgeException, OverAgeException{
		if(age >=18 && age <= 60) {
			System.out.println("Collect your Driving License");
		}
		else if(age < 18){
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			
			throw uae;
		}
		else{
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
	}
}

class StateGovernment{
	void init() {
		Rto r = new Rto();
		try {
			r.acceptInput();
			r.verify();
		}
		catch(UnderAgeException | OverAgeException e)	{
			try {
				r.acceptInput();
				r.verify();
			}
			catch(UnderAgeException | OverAgeException f) {
				try {
					r.acceptInput();
					r.verify();
				}
				catch(UnderAgeException | OverAgeException g)	{
					System.out.println("You can get your diriving license when you ar vetween 18-60 years");
				}
			}
		}
	}
}
public class RTOCentralGovernment {
	public static void main(String[] args) {
		StateGovernment sg=new StateGovernment();
		sg.init();
	}
}
