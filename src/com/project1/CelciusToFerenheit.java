package com.project1;

import java.util.Scanner;

public class CelciusToFerenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
//////		float c = sc.nextFloat();/
////		float f=(c*9/5f)+32;
//		String f =c%2==0 ? "Yes" : "No";
		if(c>9 && c<100) 
		System.out.println("Yes");
		else
		System.out.println("No");
		sc.close();		
	}

}
