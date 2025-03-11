package com.java8;


interface Interface1{
	void sayHello();
}

public class InnerClassInInterface {
	public static void main(String[] args) {
		class Demo implements Interface1{
//			@Override
			public void sayHello() {
				System.out.println("Say hello");
				
			}
		}
		Demo d = new Demo();
		d.sayHello();
	}
}
