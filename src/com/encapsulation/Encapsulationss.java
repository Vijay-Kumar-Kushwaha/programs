package com.encapsulation;

class Demo{
	private int bal =1000;
	public int getBal() {
		return bal;
	}
}
public class Encapsulationss {
	public static void main(String[] args) {
		Demo d = new Demo();
		
		System.out.println(d.getBal());
//		System.out.println(d.bal);
	}

}
