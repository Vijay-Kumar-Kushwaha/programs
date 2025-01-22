package com.multithreading;

class Worrior1 extends Thread {

	String nuclearBomb1 = "Brahmastra";
	String nuclearBomb2 = "Pashupatastra";
	String nuclearBomb3 = "Sarpastra";
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("ARJUNA")) {
			arjun();
		}
		else{
			karna();
		}
	}
	void arjun() {
		try {
			Thread.sleep(3000);
			synchronized (nuclearBomb1) {
				System.out.println("Arjuna acquired Brahmastra");
				Thread.sleep(3000);
				synchronized (nuclearBomb2) {
					System.out.println("Arjuna acquired Pashupatastra");
					synchronized (nuclearBomb3) {
						Thread.sleep(3000);
						System.out.println("Arjuna acquired Sarpastra");
						Thread.sleep(3000);
				}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void karna() {
		try {
			Thread.sleep(3000);
			synchronized (nuclearBomb3) {
				Thread.sleep(3000);
				System.out.println("Karna acquired Sarpastra");
				synchronized (nuclearBomb2) {
					Thread.sleep(3000);
					System.out.println("Karna acquired Pashupatastra");
					synchronized (nuclearBomb1) {
						System.out.println("Karna acquired Brahmastra");
						Thread.sleep(3000);
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class LifeCycleOfThreadDeadLock {
	public static void main(String[] args) {
		Worrior1 w1 = new Worrior1();
		w1.setName("ARJUNA");
		Worrior1 w2 = new Worrior1();
		w2.setName("KARNA");
		w1.start();
		w2.start();
	}
}















 