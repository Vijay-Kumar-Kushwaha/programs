package com.project1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("prime Number");
		int n = sc.nextInt();
		for(int i =2; i<=n; i++) {
			if(n%i!=0) {
				System.out.println("Yes");
			}
		}
		sc.close();
	}

}
