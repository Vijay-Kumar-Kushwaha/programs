package com.string;

public class CommandLine {
	public static void main(String... args) {
		int[] a = new int[]{1, 2,31};
//		a[0];=23;
//		a[1];=23;
//		a[2];=23;
		printArray(a);
		
	}
	static void printArray(int... a) {
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}
