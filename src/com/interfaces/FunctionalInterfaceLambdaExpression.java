package com.interfaces;

interface Haveli{
	void jhoomer(int a, int b);
}


public class FunctionalInterfaceLambdaExpression {
	public static void main(String[] args) {
		Haveli h = (a, b) -> {
			
			System.out.println("wonderfull Jhoomer's price is: " +a+ " and "+b);
			System.out.println("hello");
			System.out.println("hii");
			System.out.println("how are you");
			System.out.println("i'm fine ");
			
		};
		h.jhoomer(1000000, 20000);
	}
}














/*interface Haveli{
	void jhoomer(int a);
}


public class FunctionalInterfaceLambdaExpression {
	public static void main(String[] args) {
		Haveli h = a -> {System.out.println("wonderfull Jhoomer's price is "+a);};
		h.jhoomer(1000000);
	}
}*/

/*
  	interface Haveli{
		void jhoomer(int a);
	}
  
  public class FunctionalInterfaceLambdaExpression {
	public static void main(String[] args) {
		Haveli h = (int a) -> {System.out.println("wonderfull Jhoomer's price is "+a);};
		h.jhoomer(1000000);
	}
}*/

/*
 * interface Haveli{
		void jhoomer();
	}
 * public class FunctionalInterfaceLambdaExpression {
	public static void main(String[] args) {
		Haveli h = () -> {System.out.println("Jhoomer is wonderfull");};
		h.jhoomer();
	}
}*/
