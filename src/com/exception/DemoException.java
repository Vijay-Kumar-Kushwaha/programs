package com.exception;

import java.util.Scanner;

public class DemoException {
	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			System.out.println("Addition started");
			System.out.println("Enter first vlaue for addition");
			int a = scan.nextInt();
			System.out.println("Enter second vlaue for addition");
			int b = scan.nextInt();
			int sum = a+b;
			System.out.println("Sum of above two number is: "+ sum);
			System.out.println("Addition ended");
		}
		catch(Exception e) {
			System.out.println("only integer data accepted");
		}
		
		DemoException de1 = new DemoException();
		de1.sub();
		de1.mul();
		
		
	}

	void sub() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Subtraction started");
		System.out.println("Enter first vlaue for subtraction");
		int a = scan.nextInt();
		System.out.println("Enter second vlaue for subtraction");
		int b = scan.nextInt();
		int sub = a-b;
		System.out.println("Subtraction of above two number is: "+ sub);
		System.out.println("Subtraction ended");
		
	}
	void mul() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Multiplication started");
		System.out.println("Enter first vlaue for multiplication");
		int a = scan.nextInt();
		System.out.println("Enter second vlaue for multiplication");
		int b = scan.nextInt();
		int mul = a*b;
		System.out.println("Multiplication of above two number is: "+ mul);
		System.out.println("Multiplication ended");
		
	}
}
