package com.exception;
//
import java.io.IOException;

public class ExceptionInsideCatchBlock {
	public static void main(String[] args) {
		secondMethod();
	    
	}
	static void firstMethod() throws IOException{
		try {
	        int a = 10 / 0;
	    } 
	    catch (ArithmeticException e) {
	        System.out.println("Exception caught: " + e.getMessage());
	        throw new IOException("New Exception has been catched in catch block");
	    }
	    System.out.println("This line will not be executed");
	}
	static void secondMethod() {
		try {
			firstMethod();
		} catch (Exception e) {
			System.out.println("catched in call up stack");
		}
	}
}