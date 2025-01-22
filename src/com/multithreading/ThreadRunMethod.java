package com.multithreading;

import java.util.Scanner;

class Demo1 extends Thread{
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
class Demo2 extends Thread{
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
class Demo3 extends Thread{
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
public class ThreadRunMethod {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d1.start();
		d2.start();
		d3.start();
		
//		d1.run();
//		d2.run();
//		d3.run();
		
		
		
		
		
		
	}
}
