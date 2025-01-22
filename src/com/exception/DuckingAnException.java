package com.exception;

import java.util.Scanner;

class Demo1{
	void fun1() throws Exception{
		System.out.println("Connection estb 2");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a/b;
		System.out.println("Result is: "+c);
		System.out.println("Connection trmt2");
		scan.close();
	}
}
public class DuckingAnException {
	public static void main(String[] args) throws Exception{
		
		System.out.println("Connection estb1");
		try {
			Demo1 d = new Demo1();
			d.fun1();
		}
		catch(Exception e) {
			System.out.println("Handled in main");
		}
		System.out.println("Connection trmt1");
	}
}
