package com.project1;

import java.util.Scanner;

class FibonacciSeries {
	public static void main(String[] args) {
		int n1=0,  n2=1, n3, i, count;
		Scanner sc = new Scanner(System.in);
		try {			
			System.out.println("Enter the number of terms to print the fibonacci series");
			count = sc.nextInt();
			System.out.print(n1+" "+n2);
			for(i=3; i<=count; i++) {
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
		}finally {
		sc.close();
		}
	}

}
