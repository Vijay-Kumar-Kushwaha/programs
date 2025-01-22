package com.multithreading;


class Queue1{
	private int data;
	boolean dataIsPresent = false;
	
	public synchronized void setData(int data) {
		if(dataIsPresent == false) {
			this.data = data;
			System.out.println("Producer produced the value: "+data);
			dataIsPresent = true;
			notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void getData() {
		if(dataIsPresent ==true) {
			System.out.println("Consumer consumed the value "+data);
			dataIsPresent = false;
			notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Producer1 extends Thread{
	
	Queue1 q;
	Producer1(Queue1 q){
		this.q = q;
	}
	
	@Override
	public void run() {
		int i = 1;
		for(; ;) {
			q.setData(i++);
		}
	}
}
class Consumer1 extends Thread{
	
	Queue1 q;
	Consumer1(Queue1 q){
		this.q = q;
	}
	
	@Override
	public void run() {
		for(; ;) {
			q.getData();
		}
	}
}

public class FullyProducerConsumer {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		
		Producer1 p = new Producer1(q);
		p.setName("Producer");
		
		Consumer1 c = new Consumer1(q);
		c.setName("Consumer");
		
		p.start();
		c.start();
	}
}





