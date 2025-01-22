package com.interfaces;

interface Calculator{
	void add();
	void sub();
}

abstract class MyCalculator1 implements Calculator{
	@Override
	public void add() {
		int a = 10;
		int b =20;
		int c = a+b;
		System.out.println("sum is "+c);
		
	}
	
//	@Override
//	public void sub() {
//		int a = 10;
//		int b =20;
//		int c = a - b;
//		System.out.println("subtraction is "+c);		
//	}
}
class MyCalculator11 extends MyCalculator1
{
	@Override
	public void sub() {
		System.out.println("hero");
	}
}
class MyCalculator2 implements Calculator{
	@Override
	public void add() {
		int a = 100;
		int b =200;
		int c = a+b;
		System.out.println("Addition is "+c);		
	}
	
	@Override
	public void sub() {
		int a = 100;
		int b = 200;
		int c = a - b;
		System.out.println("subtraction is "+c);		
	}
}
public class IntefaceImplementation {
	public static void main(String[] args) {
		MyCalculator11 m1 = new MyCalculator11();
		MyCalculator2 m2 = new MyCalculator2();
		m1.add();
		m1.sub();
		m2.add(); 
		m2.sub();
		
		
		//here POLYMORPHISM HAS BEEN ACHIEVED
		Calculator m11 = new MyCalculator11();		
		Calculator m22= new MyCalculator2();		
		m11.add();
		m11.sub();
		m22.add();
		m22.sub();
	}
}
