package com.multithreading;

class BathRoom{
	synchronized void bathRoom() {
		try {
			System.out.println(Thread.currentThread().getName()+" has entered in the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is exited from the bathroom");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		System.out.println(Thread.currentThread().getName()+" is executing stmt1");
//		Thread.sleep(3000);
//		System.out.println(Thread.currentThread().getName()+" is executing stmt2");
//		Thread.sleep(3000);
//		System.out.println(Thread.currentThread().getName()+" is executing stmt3");
//		Thread.sleep(3000);
//		System.out.println(Thread.currentThread().getName()+" is executing stmt4");
//		Thread.sleep(3000);
//		System.out.println(Thread.currentThread().getName()+" is executing stmt5");
//		Thread.sleep(3000);
//		System.out.println(Thread.currentThread().getName()+" is executing stmt6");
//		Thread.sleep(3000);
//		System.out.println(Thread.currentThread().getName()+" is executing stmt7");
		
	}
}

class Boy extends Thread{
	
	BathRoom ba;
	
	public Boy(BathRoom ba) {
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathRoom();
	}
}
class Girl extends Thread{
	
	BathRoom ba;
	
	public Girl(BathRoom ba) {
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathRoom();
	}
}
class Others extends Thread{

	BathRoom ba;
	
	public Others(BathRoom ba) {
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.bathRoom();
	}
}
public class Synchronizationn {
	public static void main(String[] args) {
		BathRoom ba = new BathRoom();
		Boy b = new Boy(ba);
		Girl g = new Girl(ba);
		Others o = new Others(ba);
		b.setName("Boy");
		g.setName("Girl");
		o.setName("Other");
		
		b.start();
		g.start();
		o.start();
		
	}
}
