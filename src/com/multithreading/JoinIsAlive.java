package com.multithreading;

class Alpha1 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		try {
			t.getName();
			System.out.println(t.getName()+"  is executing stmt1");
			Thread.sleep(2000);
			System.out.println(t.getName()+"  is executing stmt2");
			Thread.sleep(2000);
			System.out.println(t.getName()+"  is executing stmt3");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Beta1 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+"  is executing stmt1");
			Thread.sleep(2000);
			System.out.println(t.getName()+"  is executing stmt2");
			Thread.sleep(2000);
			System.out.println(t.getName()+"  is executing stmt3");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class JoinIsAlive {
	public static void main(String[] args) {
		System.out.println("Main thread started executing");
		Alpha1 a = new Alpha1();
		Beta1 b = new Beta1();
		a.start();
		try {
			a.join();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		b.start();
		try {
			b.join();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main thread ended execution");
	}

}
