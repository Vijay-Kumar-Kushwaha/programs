package com.exception;

import java.util.Scanner;

class Demo{
	void fun1() throws Exception {
		System.out.println("Connection estb2 ");
		try {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a/b;
			scan.close();
			System.out.println("Result is: "+c);
		}
		catch(Exception e)
		{
			System.out.println("Handledin fun1");
			throw e;
		}
		finally {
			System.out.println("Connection terminated2");
		}
	}
}
public class ThrowThrows {
	public static void main(String[] args) {
		try {
			System.out.println("Connection estb 1");
			Demo d = new Demo();
			d.fun1();
		}
		catch(Exception e) {
			System.out.println("handled in main");
		}
		System.out.println("Conn trmt 2");
	}
}
