package com.constructor;

import java.util.Scanner;

class Customer{
	private int a;
	private int b;
	private String name;
	Customer(){
		System.out.println("Hello world");
		System.out.println("I'm constructor");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class constructor {
	public static void main(String[] args) {
		Customer c1 = new Customer();
//		Customer c2 = new Customer(1, "as");
		c1.setA(10);
		c1.setB(200); 
		c1.setName("vijay");
		System.out.println(c1.getA() + " " + c1.getB() + " " + c1.getName());  
	}

}
