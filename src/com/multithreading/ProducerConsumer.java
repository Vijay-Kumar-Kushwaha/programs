package com.multithreading;


class Queue{
	private int data;
	public void setData(int data) {
		this.data = data;
		System.out.println("Producer produced the value: "+data);
	}
	
	public void getData() {
		System.out.println("Consumer consumed the value "+data);
	}
}

class Producer extends Thread{
	
	Queue q;
	Producer(Queue q){
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
class Consumer extends Thread{
	
	Queue q;
	Consumer(Queue q){
		this.q = q;
	}
	
	@Override
	public void run() {
		for(; ;) {
			q.getData();
		}
	}
}

public class ProducerConsumer {
	public static void main(String[] args) {
		Queue q = new Queue();
		
		Producer p = new Producer(q);
		p.setName("Producer");
		
		Consumer c = new Consumer(q);
		c.setName("Consumer");
		
		p.start();
		c.start();
	}
}





