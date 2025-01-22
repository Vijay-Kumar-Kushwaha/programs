package com.interfaces;

interface Calc{
	void add();
	void sub();
}

abstract class MyCalc1 implements Calc{
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
class MyCalc11 extends MyCalc1
{
	@Override
	public void sub() {
		System.out.println("hero");
	}
}
class MyCalc2 implements Calc{
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

class Animal{
	void permit(Calc input)	{
		input.add();
		input.sub();
	}
}
public class InterfaceUsingPolymorphism {
	public static void main(String[] args) {
//		MyCalc11 m1 = new MyCalc11();
//		MyCalc2 m2 = new MyCalc2();
//		m1.add();
//		m1.sub();
//		m2.add(); 
//		m2.sub();
		
		
		//this is done
		MyCalc11 m1 = new MyCalc11();
		MyCalc2 m2 = new MyCalc2();
		Animal a = new Animal();
		a.permit(m1);
		a.permit(m2);
		
		//here POLYMORPHISM HAS BEEN ACHIEVED using loose coupling
//		Calculator m11 = new MyCalculator11();		
//		Calculator m22= new MyCalculator2();		
//		m11.add();
//		m11.sub();
//		m22.add();
//		m22.sub();
	}
}
