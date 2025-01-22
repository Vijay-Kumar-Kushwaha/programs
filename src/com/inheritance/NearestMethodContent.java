package com.inheritance;

class Parent11{
	
	void disp() {
		System.out.println("HI");
	}
}
class Child11 extends Parent11{
	void disp() {
		System.out.println("HELLO");
	}
}
public class NearestMethodContent {
	public static void main(String[] args) {
		Child11 c = new Child11();
		c.disp();
	}
}
