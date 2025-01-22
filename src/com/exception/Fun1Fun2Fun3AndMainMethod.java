package com.exception;

import java.util.Scanner;

class Alpha{
	void fun1() {
		System.out.println("Connection established3");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerator");
		int a = sc.nextInt();
		System.out.println("Enter denominator");
		int b = sc.nextInt();
		int c= a/b;
		sc.close();
		System.out.println("Result is: "+c);
		System.out.println("COnnection terminated3");
	}
}

class Beta{
	void fun2() {
		System.out.println("Connection established2");
		try{
			Alpha a = new Alpha();
			a.fun1();
		}
		catch(Exception e) {
			System.out.println("Give non-zero denominator");
		}
		System.out.println("COnnection terminated2");
	}
}
class Gama{
}
public class Fun1Fun2Fun3AndMainMethod {
	public static void main(String[] args) {
		System.out.println("Connection established1");
		Beta b = new Beta();
		b.fun2();
		System.out.println("COnnection terminated1");
	}

}
