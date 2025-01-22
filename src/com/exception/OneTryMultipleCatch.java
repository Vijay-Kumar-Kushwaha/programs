package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OneTryMultipleCatch {
	public static void main(String[] args) {
		System.out.println("Connection established");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numerator");
			int a = sc.nextInt();
			System.out.println("Enter denominator");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("result is: "+c);
			System.out.println("Enter the size of the array");
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the to be inserted");
			int data = sc.nextInt();
			System.out.println("Enter the array index at which data needs to be inserted");
			int index = sc.nextInt();
			sc.close();
			arr[index] = data;
			System.out.println(arr[index]);
		}
		catch(InputMismatchException i) {
			System.out.println("Enter only integer type value");
		}
			catch(ArithmeticException a) {
			System.out.println("Give non zero denominator"+a.getMessage());
		}
		catch(NegativeArraySizeException n) {
			System.out.println("Dont use negative array size index");
		}
		
		
		catch(ArrayIndexOutOfBoundsException a2) {
			System.out.println("Dont use negative array size index");
		}
		
		catch(Exception n2) {
			System.out.println("Some Exception occur");
		}
	}
}





















