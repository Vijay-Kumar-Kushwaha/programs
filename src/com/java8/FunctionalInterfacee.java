package com.java8;

//@FunctionalInterface
interface MyFunctionalInterface{
	void sayHi();
	void sayHello();
}

public class FunctionalInterfacee {
	public static void main(String[] args) {
		MyFunctionalInterface fi = new MyFunctionalInterface() {
			
			@Override
			public void sayHi() {
				System.out.println("Say Hi");
				
			}
			@Override
			public void sayHello() {
				System.out.println("say hello");
				
			}
		};
		fi.sayHi();
		fi.sayHello();
	}

}
