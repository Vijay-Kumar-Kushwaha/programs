package com.multithreading;
class Demmo1 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <5; i++)	{
			System.out.println("User thread executing");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Demmo2 extends Thread{
	@Override
	public void run() {
		for(;;)	{
			System.out.println("Daemon Therad Executing");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class SetDaemonThreadBOOKwala {
	public static void main(String[] args) {
		System.out.println("Main() method started execution");
		Demmo1 d1 = new Demmo1();
		Demmo2 d2 = new Demmo2();
		d2.setDaemon(true);
		d1.start();
		d2.start();
		System.out.println("Main() method ended execution");
	}
}
