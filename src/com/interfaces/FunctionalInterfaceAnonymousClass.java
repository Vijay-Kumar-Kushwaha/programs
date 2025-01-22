package com.interfaces;

@FunctionalInterface
interface Home{
	void room();
}

public class FunctionalInterfaceAnonymousClass {
	public static void main(String[] args) {
		Home d = new Home() {
			@Override
			public void room() {
				System.out.println("Hello");
			}
		};
		d.room();
	}
}
