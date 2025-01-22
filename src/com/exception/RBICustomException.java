package com.exception;

import java.util.Scanner;

class InvalidPinException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid PIN";
	}
}
class Atm{
	int pin = 1234;
	int pCustomer;
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the PIN");
		pCustomer = scan.nextInt();
	}
	public void verify() throws InvalidPinException {
		if(pin == pCustomer) {
			System.out.println("Collect your money");
		}
		else {
			System.out.println("Invalid PIN");
			InvalidPinException ipe = new InvalidPinException();
			ipe.getMessage();
			throw ipe;
		}
	}
}

class Bank{
	void init() {
		Atm a = new Atm();
		try {
			a.acceptInput();
			a.verify();
		}
		catch(Exception e) {
			try {
				a.acceptInput();
				a.verify();
			}
			catch(Exception f) {
				try {
					a.acceptInput();
					a.verify();
				}
				catch(Exception g) {
					System.out.println("Card blocked!!! Contact Bank");
				}
			}
		}
	}
}
public class RBICustomException {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.init();
	}
}
