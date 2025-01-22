package com.project1;

import java.util.Scanner;

public class PrimeCheckWithReturnType {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.close();
	String isPrime=checkPrime(n);
	//Your code here
	System.out.println(isPrime);
	}
	
	static String checkPrime(int n) {
		// write your code here
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if (count==2) {
			return "Yes";			
		}
		else {
			return "No";
		}
	}

}
