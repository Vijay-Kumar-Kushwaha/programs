package com.tap.oops;

import java.util.Scanner;

abstract class Shape
{	
	float area;
	abstract void acceptInput();
	abstract void calcArea();
	void dispArea(){
		System.out.println("Area is: "+area);
	}
}

class Square extends Shape{
	private float side;
	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side");
		side = sc.nextFloat();
	}
	@Override
	void calcArea() {
		area = side*side;		
	}
}
class Rectangle extends Integer{
	private float length;
	private float breadth;
	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		length = sc.nextFloat();
		System.out.println("Enter breadth of rectangle");
		breadth = sc.nextFloat();
	}
	@Override
	void calcArea() {
		area = length*breadth;		
	}
}
class Circle extends Shape{
	private float radius;
	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		radius = sc.nextFloat();
	}
	@Override
	void calcArea() {
		area = 3.142f*radius*radius;		
	}
}

class Geometry{
	public void permit(Shape s) {
		s.acceptInput();
		s.calcArea();
		s.dispArea();
	}
}

public class CompleteOopsConceptInAProgram {
	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Geometry g = new Geometry();
		g.permit(s);
		g.permit(r);
		g.permit(c);
	}
}
