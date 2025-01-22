package com.superr.call;
/*
 * it will not work because we cannot give block statement directly inside the class
 * as we have given in the child class*/
class Parent1{
	int a =100;
}
class Child1 extends Parent1{
//	System.out.println(a);
}
public class NotWorkingBecause {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
	}
}
