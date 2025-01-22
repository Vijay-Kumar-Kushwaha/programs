package com.abstraction;

abstract class Parent{
	public Parent() {
//		System.out.println("Inside Parent Constructor");
	}
	public Parent(int b) {
		System.out.println("Inside Parent parameterized Constructor");
	}
}

class Child extends Parent{
//	public Child() {
////		super();
//		this(100);
//		System.out.println("Inside Child Class");
//	}
	public Child(int a){
		super(a);
		System.out.println("Inside parameterised Child Constructor");
	}
	
}
public class AbstractConstructor {
	public static void main(String[] args) {
		Child c = new Child(100);
		
		
	}

}
