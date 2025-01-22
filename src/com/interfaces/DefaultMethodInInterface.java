package com.interfaces;


//TO SUPPORT THE BACKWARD COMPATIBILITY

// we can give the method body inside the interface, but access midifier should of "DEAFULT" type
interface Calculatoras{
	void add();
	default void sub() {
		System.out.println("subtraction method");
	}	
}

class MyCalculator implements Calculatoras{
	@Override
	public void add() {
		System.out.println("Addition in implementing class");		
	}
}
public class DefaultMethodInInterface {
	public static void main(String[] args) {
		MyCalculator m = new MyCalculator();
		m.add();
		m.sub();
	}

}
