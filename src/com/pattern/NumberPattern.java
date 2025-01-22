package com.pattern;

import java.util.Scanner;
//01 02 03 04 05 
//02 03 04 05 06 
//03 04 05 06 07 
//04 05 06 07 08 
//05 06 07 08 09 
public class NumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int count;
		for(int i = 0; i < n; i++ ) {
			count = i+1;
			for(int j = 0; j < n; j++)	{
				if(count < 10)	{
					System.out.print("0");
				}
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}

}
