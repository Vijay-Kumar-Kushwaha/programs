package com.multithreading;

class Alpha extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("1.  Alpha Current Thread: "+t);
		t.getName();
		System.out.println("1.  Getting Name of thread alpha class: "+t);
		t.setName("BABA");
		System.out.println("1.  New Name of thread alpha class: "+t);
		t.getPriority();
		System.out.println("1.  Priority of thread alpha class: "+t);
		t.setPriority(3);
		System.out.println("1.  Changed Priority of thread Alpha class: "+t);
		t.getName();
		System.out.println("1.  Getting name of the thread Alpha class: "+t);
		System.out.println();
	}
}
class Beta extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("2.  Beta Current Thread: "+t);
		t.getName();
		System.out.println("2.  Getting Name of thread Beta class: "+t);
		t.setName("BABY");
		System.out.println("2.  New Name of thread alpha Beta: "+t);
		t.getPriority();
		System.out.println("2.  Priority of thread alpha Beta: "+t);
		t.setPriority(3);
		System.out.println("2.  Changed Priority of thread Beta class: "+t);
		t.getName();
	}
}
public class CurrentlyExecutingThread {
	public static void main(String[] args) {
		Thread t =  Thread.currentThread();
		System.out.println("Main class thread"+t);
		System.out.println();
		Alpha a = new Alpha();
		a.start();
		Beta b = new Beta();
		b.start();
	}

}
