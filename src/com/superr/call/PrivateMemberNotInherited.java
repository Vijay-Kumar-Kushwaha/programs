package com.superr.call;
/*
 * it will not work because we cannot private cannot be directly inherited
 * as we have given in the child class*/
class Parent11{
	private int a =100;
	int getA() {
		return a;
	}
}
class Child11 extends Parent11{
	void  disp() {
//		System.out.println(a);
		System.out.println(getA());
	}
}
public class PrivateMemberNotInherited {
	public static void main(String[] args) {
		Child11 c1 = new Child11();
		c1.disp();
	}
}
