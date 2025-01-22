package com.superr.call;

class Testt1{
	int x,y;
	Testt1(){
		x = 100;
		y = 200;
	}
	Testt1(int x, int y)	{
		this.x = x;
		this.y = y;
	}
}

class Testt2 extends Testt1{
	int a, b;
	Testt2(){
		a = 300;
		b = 400;
	}
	Testt2(int a, int b)	{
		super(a,b);
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
public class SuperCallProgram3 {
	public static void main(String[] args) {
		Testt2 t2 = new Testt2(9, 99);
		t2.disp();
	}
}
