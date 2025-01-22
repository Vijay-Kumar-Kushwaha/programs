package com.multithreading;

class BathRoom1{
		void bathRoom() {
		try {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName()+" is executing stmt1");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" is executing stmt2");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" is executing stmt3");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" is executing stmt4");
				Thread.sleep(2000);
			}
			System.out.println(Thread.currentThread().getName()+" is executing stmt5");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" is executing stmt6");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" is executing stmt7");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Boy1 extends Thread{
	
	BathRoom1 ba;
	
	public Boy1(BathRoom1 ba) {
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathRoom();
	}
}
class Girl1 extends Thread{
	
	BathRoom1 ba;
	
	public Girl1(BathRoom1 ba) {
		this.ba = ba;
	}
	
	@Override
	public void run() {
		ba.bathRoom();
	}
}
class Others1 extends Thread{

	BathRoom1 ba;
	
	public Others1(BathRoom1 ba) {
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.bathRoom();
	}
}
public class SomeInstructionOnlySynchronized {
	public static void main(String[] args) {
		BathRoom1 ba = new BathRoom1();
		Boy1 b = new Boy1(ba);
		Girl1 g = new Girl1(ba);
		Others1 o = new Others1(ba);
		b.setName("Boy");
		g.setName("Girl");
		o.setName("Other");
		
		b.start();
		g.start();
		o.start();
		
	}
}
