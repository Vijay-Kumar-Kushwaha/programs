package com.interfaces;

interface Student{
	static void personalLife() {
		redundantCode();
	}
	static void professionalLife() {
		redundantCode();		
	}
	private static void redundantCode() {
		System.out.println("Hello");
		System.out.println("Hi");
		System.out.println("How are you");
	}
}

public class PRivateStaticMethod {
	public static void main(String[] args) {
		Student.personalLife();
System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		Student.professionalLife();
	}
}
