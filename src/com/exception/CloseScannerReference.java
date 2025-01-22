package com.exception;

import java.util.Scanner;

public class CloseScannerReference {
	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			int a = scan.nextInt();
			System.out.println("Entered value is: "+ a);
		}
		finally {
			scan.close();
		}
	}
}
