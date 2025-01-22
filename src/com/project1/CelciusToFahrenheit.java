package com.project1;

import java.util.Scanner;

public class CelciusToFahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		float f = (c * (9f / 5)) +32;
		
		System.out.println(f);
		int num = 5;
		float add = num+f;
		System.out.println(add);
	}

}
