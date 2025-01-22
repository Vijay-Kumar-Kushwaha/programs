package com.superr.call;

class Tesstt1{
	int x,y;
	Tesstt1(){
		x = 100;
		y = 200;
	}
	Tesstt1(int x, int y)	{
		this.x = x;
		this.y = y;
	}
}

class Tesstt2 extends Tesstt1{
	int a, b;
	Tesstt2(){
		this(9,99);
		a = 300;
		b = 400;
	}
	Tesstt2(int a, int b)	{
//		super();
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
public class SuperAndThisProgram5 {
	public static void main(String[] args) {
		Tesstt2 t2 = new Tesstt2();
		t2.disp();
	}
}
