package com.inheritance;

class Parent{
	float height = 5.6f;
	void readBooks()	{
		System.out.println("I'll read book");
	}
}
class Child extends Parent{
	
}
public class SingleLevelInheritance {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.height);
		c.readBooks();
		
	}

}
