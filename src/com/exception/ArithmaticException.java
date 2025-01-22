package com.exception;

import java.util.Scanner;

public class ArithmaticException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		try {
			int c=a/b;
			System.out.println(c);			
		}
		finally {
			System.out.println("hehhehheheqcc");
		}
		try {
			String s=scan.next();
			System.out.println("hello" +s);
		}
		catch(Exception e ){
			System.out.println("Some problem with arithmetic expression"+ e.getMessage());
		}
		System.out.println("outside of try catch block to enter the number");
		try {
			int aa = scan.nextInt();
			int ba = scan.nextInt();
			int cd=aa/ba;
			System.out.println(cd); 
		}
		finally {
			System.out.println("Ilove u");
			scan.close();
			
		}
		
	}
	
}
