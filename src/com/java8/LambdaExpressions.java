package com.java8;

@FunctionalInterface
interface MyInterface{
	void sayHello();
	default void defaultMethod() {
		System.out.println("HEllo fromm default method");
	}
	
	static void staticMethod() {
		System.out.println("Hello");
	}
}
public class LambdaExpressions {
	public static void main(String[] args) {
		MyInterface mi =() ->{System.out.println("Hello from chennai");};
		mi.sayHello();
		
		
		
		MyInterface.staticMethod();
		
		System.out.println("printing in main method");
	}
}
