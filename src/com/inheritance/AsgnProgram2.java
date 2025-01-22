//
//QUESTION
//
/*Create a class Shape, having a public method area(). Create 3 classes Square,
Rectangle and Circle which extends the class Shape. Now provide side as a
public variable in square class, provide length and breadth as public variables
in rectangle and radius as public variable in circle. Now calculate the area of
each shape with the help method present in the parent class.*/

package com.inheritance;

class Shape{
	public void area() {
		
	}
}

class Square extends Shape{
	public int side = 4;
	@Override
	public void area() {
		int areaOfSquare = side*side;
		System.out.println(areaOfSquare);
	}	
}

class Rectangle extends Shape{
	public int length = 5;
	public int breadth = 6;
	@Override
	public void area() {
		int areaOfRect = length*breadth;
		System.out.println(areaOfRect);
	}		
}

class Circle extends Shape{
	public int radius= 7;
	@Override
	public void area() {
		float areaOfCircle = 3.14f*radius*radius;
		System.out.println(areaOfCircle);
	}	
}

public class AsgnProgram2 {
	public static void main(String[] args) {
		Square s = new Square();
		s.area();
		Rectangle r = new Rectangle();
		r.area();
		Circle c = new Circle();
		c.area();
		
		
	}
}
