package com.methodoverloading;

class Demo{
	void add(int a, char b)	{
		System.out.println("int char");
	}
	void add(byte a, char b)	{
		System.out.println("byte char");
	}
}
public class ImplicittypePromotion {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(10, 'A');
		d.add('B', 'A');
		
	}

}
