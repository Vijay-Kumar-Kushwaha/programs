package com.abstraction;

abstract class Demo11{
	abstract void add();
	abstract void sub();
	void mul() {
		System.out.println("Inside mul() of Demo1");
	}	
}

abstract class Demo22 extends Demo11{
	@Override
	void sub() {
		System.out.println("Inside sub() of Demo2");
	}
	@Override
	void mul() {
		System.out.println("Inside mul() of Demo2");
	}
}
class Demo33 extends Demo22	{
	@Override
	void add() {
		System.out.println("Inside add() Demo3");
	}
}

public class AbstractClassCanOverrideAbstractMethod {
	public static void main(String[] args) {
		Demo33 d3 = new Demo33();
		d3.add();
		d3.sub();
		d3.mul();
	}
}
