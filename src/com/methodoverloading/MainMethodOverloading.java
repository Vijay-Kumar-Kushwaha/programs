package com.methodoverloading;

public class MainMethodOverloading {
	public static void main(String[] args) {
		System.out.println("1st main method");
		main(10);
		main(10, 10.23f);
		MainMethodOverloading aaa = new MainMethodOverloading();
		aaa.main(10.123f, 10.23f);
		
	}
	public static void main(int[] args) {
		System.out.println("integer array method");
	}
	public static void main(int  args) {
		System.out.println("integer method");
	}
	 static void main(int  args, float b) {
		System.out.println("int float method");
//		main(10.23f, 23.023f);   // static method me se no-static method ko 
								 //call nhi kar sakte.
								 //jaisa main(float args, float b) instance 
								 //yani ki non-static method hai. thst's why 
	}
	 void main(float  args, float b) {
		System.out.println("float float method");
		main('A', 120.12f);
	}
	void main(char  args, float b) {
		System.out.println("CHAR float method");
	}
	
}
