package com.multithreading;

import java.util.Scanner;

class Demo extends Thread	{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String s= t.getName();
		if(s.equals("PRINTCHARS")) {
		    printChars();
		} else if(s.equals("PRINTNUM")) {
		    printNumbers();
		} else {
		    div();
		}
	}
	
	public void printChars() {
		System.out.println("Printing characters started");
		for(int i = 65; i<= 69; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing characters ended");
	}

	public void printNumbers() {
		System.out.println("Printing numbers started");
		for(int i = 1; i <= 10; i++)	{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing numbers ended");
	}
	
	public void div()	{
		System.out.println("Division started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numerator");
		int a = scan.nextInt();
		System.out.println("Enter denominator");
		int b = scan.nextInt();
		int c= a/b;
		System.out.println("Division is: "+c);
		System.out.println("Division ended");
	}
}
public class InsideOneRunMethod {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		d1.setName("PRINTCHARS");
		d2.setName("PRINTNUM");
		d3.setName("DIV");
		
		d1.start();
		d2.start();
		d3.start();
	}
}
