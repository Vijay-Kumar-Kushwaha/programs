package com.project1;

import java.util.Scanner;

public class PrimeNumberSharadSir {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		printPrimeNumber(n);
	}
	
	static void printPrimeNumber(int n){
		int count=0;
		for(int i=1; i<=n; i++) {
			if (n%i==0) {
				count++;			
			}
		}
		if (count==2) {
			System.out.println(count);			
		}
		else
			System.out.println(count);
		
	}

}
