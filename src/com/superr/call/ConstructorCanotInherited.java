package com.superr.call;

class Parentt1{
	public Parentt1() {
		System.out.println("Inside Parent1");
	}
}
class Chilld1 extends Parentt1{
	public Chilld1() {
		System.out.println("Inside child1");
	}
}
public class ConstructorCanotInherited {
	public static void main(String[] args) {
		Chilld1 c = new Chilld1();
	}
}
