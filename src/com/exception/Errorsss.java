package com.exception;

//public class Errorsss {
//	public static void main(String[] args) {
//		int[] arr = new int[Integer.MAX_VALUE];
//	}
//}


class Demo3{
	void fun1() {
		fun1();
	}
}
public class Errorsss {
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.fun1();
	}
}
