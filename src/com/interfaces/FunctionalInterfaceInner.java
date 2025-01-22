package com.interfaces;

@FunctionalInterface
interface Display1{
	void swift();
}


public class FunctionalInterfaceInner {
	public static void main(String[] args) {
		class Display2 implements Display1{
			@Override
			public void swift() {
				System.out.println("Functional Interface using Inner class");
			}
		}
		
		Display2 b = new Display2();
		b.swift();
	}
}
