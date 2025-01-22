package com.multithreading;

import java.util.Scanner;

class Demo111 extends Thread{
	@Override
	public void run() {
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
	
}
class Demo222 extends Thread{
	@Override
	public void run() {
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
}

class Demo333 extends Thread{
	@Override
	public void run() {
		System.out.println("Addition started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		int c= a+b;
		System.out.println("Sum is: "+c);
		System.out.println("Addition ended");
	}
}

public class MultipleIndependentInstructionInsideOneRunMethod {
	public static void main(String[] args) {
		Demo111 d1 = new Demo111();
		Demo222 d2 = new Demo222();
		Demo333 d3 = new Demo333();
	}
}
