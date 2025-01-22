package com.superr.call;


class Test111{
	int x,y;
	Test111(){
		x = 100;
		y = 200;
	}
	Test111(int x, int y)	{
		this.x = x;
		this.y = y;
	}
}

class Test222 extends Test111{
	int a, b;
	Test222(){
		a = 300;
		b = 400;
	}
	Test222(int a, int b)	{
		this.a = a;
		this.b = b;
	}
	void disp()	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}
public class SuperCallProgram2 {
	public static void main(String[] args) {
		Test222 t2 = new Test222(9, 99);
		t2.disp();
	}
}
