package com.superr.call;


class Test11{
	int x,y;
	Test11(){
		x = 100;
		y = 200;
	}
	Test11(int x, int y)	{
		this.x = x;
		this.y = y;
	}
}

class Test22 extends Test11{
	int a, b;
	Test22(){
		a = 300;
		b = 400;
	}
	Test22(int a, int b)	{
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
public class SuperCallProgram1 {
	public static void main(String[] args) {
		Test22 t2 = new Test22();
		t2.disp();
	}
}
