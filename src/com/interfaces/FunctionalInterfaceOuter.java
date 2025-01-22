package com.interfaces;

@FunctionalInterface
interface Display{
	void disp1();					// functional interface
	default void disp2() {			// should have only one
									// abstract method
	}
	static void disp3() {
		
	}
	private void disp4() {
		
	}
	private static void disp5() {
		
	}
}
class Hero implements Display{
	@Override
	public void disp1() {
		System.out.println("Functional Interface using Outer class");
	}
}
public class FunctionalInterfaceOuter {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.disp1();
	}

}
