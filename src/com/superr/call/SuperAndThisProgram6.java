package com.superr.call;

class Teesstt1{
	int x,y;
	Teesstt1(){
		x = 100;
		y = 200;
	}
	Teesstt1(int x, int y)	{
		this();
		this.x = x;
		this.y = y;
	}
}

class Teesstt2 extends Teesstt1{
	int a, b;
	Teesstt2(){
		super(9,99);
		a = 300;
		b = 400;
	}
	Teesstt2(int a, int b)	{
		this();
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
public class SuperAndThisProgram6 {
	public static void main(String[] args) {
		Teesstt2 t2 = new Teesstt2(9,99);
		t2.disp();
	}
}
