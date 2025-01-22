package com.interfaces;

interface ExampleInterface{
	default void personalQuestion() {
		redundantCode();
	}
	
	default void professionalQuestion() {
		redundantCode();
	}

	private void redundantCode() {
		System.out.println("heyy");
		System.out.println("hii");
		System.out.println("whats your name");
	}
}
class ExampleClass implements ExampleInterface{
	
}
public class PrivateDefaultMethod {
	public static void main(String[] args) {
		ExampleClass e = new ExampleClass();
		e.personalQuestion();
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		e.professionalQuestion();
	}
}
