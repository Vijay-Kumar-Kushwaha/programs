package com.exception;

import java.util.Scanner;

public class ExcceptionChildParentpolymorphism {
	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
//			scan = new Scanner(System.in);
			System.out.println("Enter the size of array");
			int n = scan.nextInt();
			int[] arr = new int[n];
			System.out.println(arr);
			display();
		}
		
//		catch(Exception e)
//		{
//			System.out.println("Handled");
//		}
		
//		catch(Throwable e)
//		{
//			System.out.println("Handled");
//		}
		
		catch(RuntimeException e)
		{
			System.out.println("Handled");
//			e.printStackTrace();
		}
		
		finally {
			if(scan != null)	{
				scan.close();
				System.out.println("Scanner closed");
			}
		}
	}

	static void display() {
		System.out.println("Hello wordl!!!");
	}
}
