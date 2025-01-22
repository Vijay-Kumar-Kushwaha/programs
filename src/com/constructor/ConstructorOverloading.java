package com.constructor;

import java.util.Scanner;

class Customer1
{
	private int cid; 
	private String cName;
	private int cNum;
	public Customer1()
	{
		cid = 1;
		cName = "Arul";
		cNum = 98749;
	}
	public Customer1(int cid, String cName, int cNum)	{
		this.cid = cid;
		
		this.cName = cName;
		this.cNum = cNum;
	}
	public int getCid() {
		return cid;
	}
	
	public String getcName() {
		return cName;
	}
		public int getcNum() {
		return cNum;
	}
		
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Customer1 c1 = new Customer1();
		System.out.println(c1.getCid()+" "+c1.getcName()+" "+ c1.getcNum());
		Customer1 c2 = new Customer1(2, "Alex", 987123);
		System.out.println(c2.getCid()+" "+c2.getcName()+" "+ c2.getcNum());
	}

}
