package com.abstraction;

abstract class Parent1{
	abstract void add();
	void sub() {
		System.out.println("inside substract method");
	}
	
}
abstract class Demo1 extends Parent1{

//	@Override
//	void add() {
//		System.out.println("Inside add method");		
//	}	
}
class Demo2 extends Parent1{
//	@Override
//	void sub() {
//		System.out.println("inside sub overriden method");
//	}
	@Override
	void add() {
		System.out.println("inside add");
	}
}

public class NormalClassExtendsAbstractClass {
	public static void main(String[] args) {
//		demo1 d1 = new demo1();
		Demo2 d = new Demo2();
		d.add();
		d.sub();
	}
}
