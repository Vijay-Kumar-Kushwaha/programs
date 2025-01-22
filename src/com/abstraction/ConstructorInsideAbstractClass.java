package com.abstraction;

abstract class Ddemo1{
	abstract void add();
	abstract void sub();
	void mul() {
		System.out.println("Inside Demo1");
	}
	public Ddemo1() {
		System.out.println("Inside demo1 Zero Parameter Cnstructor");
	}
	public Ddemo1(int a,int b) {
		System.out.println("Inside demo1 two Parameter Cnstructor");
	}
}
abstract class Demo2222 extends Ddemo1{

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void sub() {
		System.out.println("Inside Demo222 Sub() method");
	}
	
	public Demo2222() {
		super(10, 20);
		System.out.println("inside demo2 zero para const");
	}
	
	
	public Demo2222(int a, int b) {
		super(10, 20);
		System.out.println("inside demo2 two para const");
		
	}
}

//class Ddemo3 extends Demo2222{
//	@Override
//	void add() {
//		// TODO Auto-generated method stub
//		
//	}
//}
public class ConstructorInsideAbstractClass {
	public static void main(String[] args) {
		Demo2222 d = new Demo2222();
		d.sub();
		
	}

}
