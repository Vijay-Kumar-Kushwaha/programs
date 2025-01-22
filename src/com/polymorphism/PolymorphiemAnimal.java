//package com.polymorphism;
//
//class Animal{
//	void breath() {
//		System.out.println("Animals breath");
//	}
//	void eat() {
//		System.out.println("Animals eats");
//	}
//}
//class Lion extends Animal{
//	@Override
//	void breath() {
//		System.out.println("Lion breaths");
//	}
//	void eat() {
//		System.out.println("Lions eats meats");
//	}
//}
//class Monkey extends Animal	{	
//	@Override
//	void breath(){
//		System.out.println("Monkey breaths");
//	}
//	@Override
//	void eat() {
//		System.out.println("Monkey eats Banana");
//		
//	}
//}
//
//
//class Forest{
//	public static void animalKingdom(Animal ref) {
//		ref.breath();
//		ref.eat();
//		
//	}
//	
//}
//
//
//public class PolymorphiemAnimal {
//	public static void main(String[] args) {
//		Lion l = new Lion();
//		Monkey m = new Monkey();
////		Forest f = new Forest();
////		f.animalKingdom(l);
////		f.animalKingdom(m);
//		
//		Forest.animalKingdom(l);
//		Forest.animalKingdom(m);
//		
//	}
//}


package com.polymorphism;


class Animal{
	void breath() {
		System.out.println("Animals breath");
	}
	void sleep() {
		System.out.println("Animals sleep");
	}
}

class Lion extends Animal{
	@Override
	void breath() {
		System.out.println("Lion breath");	
	}
	
	@Override
	void sleep() {
		System.out.println("Lion sleeps");
	}
}

class Monkey extends Animal{
	@Override
	void breath() {
		System.out.println("Monkey breaths");
	}
	
	@Override
	void sleep() {
		System.out.println("Monkey sleeps");
	}
}

class Forest{
	public static void permit(Animal ref)	{
		ref.breath();
		ref.sleep();
	}
}

public class PolymorphiemAnimal {
	public static void main(String[] args) {
		Animal ref;
		Lion l = new Lion();
		Monkey m = new Monkey();
//		Forest f = new Forest();
//		f.permit(l);
//		f.permit(m);
		
		Forest.permit(l);
		Forest.permit(m);
		
	}
}