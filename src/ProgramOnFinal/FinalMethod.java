package ProgramOnFinal;

/*
 *	QUESTION:-  a final method disp() from the Parent class Can be treated as the specialized method in the Child class?
 * No, a final method from the Parent class cannot be treated as a 
 * specialized method in the Child class. In Java, when a method is marked
 *  as final in the parent class, it cannot be overridden or specialized in 
 *  any subclass, including the child class.

 *	Why?
 *The purpose of marking a method as final is to prevent it from being 
 *overridden. When a method is declared as final, it means that its 
 *behavior is "locked," and subclasses are not allowed to provide their own 
 *versions or specializations of that method.
 **/
class Parent{
	final void disp() {
		System.out.println("HELLO");
	}
}
class Child extends Parent{
	
	//	@Override
	//	void disp() {
	//		System.out.println("HI");
	//	}
}
public class FinalMethod {
	public static void main(String[] args) {
		
	}
}
