package com.methodoverloading;

class Demoo{
	void disp(int a) {
		System.out.println("Integer");
	}
	void disp(int a, int b) {
		System.out.println("Integer Integer");
		
	}
}
public class ArgumentExplicitConversion {
	public static void main(String[] args) {
		Demoo d = new Demoo();
		d.disp((int)10.23, (int)10.23);
	}

}
