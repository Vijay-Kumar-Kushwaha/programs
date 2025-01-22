package com.constructor;

class Customer11{
	public Customer11(int a , float b)	{
		System.out.println("Inside Parametrised Constructor");
	}
}
public class ConstructorObjectWithoutDefaultConstructor {
	public static void main(String[] args) {
		Customer11 c1 = new Customer11(10, 32.0f);	
//		c1.customer11();./
	}
}
