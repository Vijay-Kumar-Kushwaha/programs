package com.string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String Value");
		String s = sc.nextLine();
		sc.close();
		reverseString(s);
	}
	static void reverseString(String str) {
		String s = "";
		for(int i = str.length()-1; i >=0; i--) {
			s = s+str.charAt(i);
		}
		System.out.println(s);
	}

}
