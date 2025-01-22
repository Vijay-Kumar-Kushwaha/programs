package com.project1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String original, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to check whether it is palindrome or not");
		original = sc.nextLine();
		int len = original.length();
		for(int i = len-1; i>=0; i--) {
			reverse = reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("It is palindrome");
		else System.out.println("It is not palindrome");				
	sc.close();
	}

}
