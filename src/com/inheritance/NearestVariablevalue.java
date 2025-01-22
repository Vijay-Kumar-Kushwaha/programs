package com.inheritance;

class Parent1{
	int i = 9;
}
class Child1 extends Parent1{
	int i = 99;
	void disp()	{
		System.out.println(i);				// 99      <--output
		System.out.println(super.i);		// 9       <--output
	}
}
public class NearestVariablevalue {
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.disp();
	}
}
