package com.methodoverloading;

class Demo1{
	void add(int a, char b)	{
		System.out.println("int char");
	}
	void add(char a, int b) {
		System.out.println("char int");
	}
}
public class AmbiguityWhileMethodBinding {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.add('A', 'B');
		
	}

}
