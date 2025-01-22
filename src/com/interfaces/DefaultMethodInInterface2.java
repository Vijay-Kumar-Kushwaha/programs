package com.interfaces;
// DEFAULT METHOD ALSO HAVE PUBLIC ACCESS MODIFIER
interface SeaAnimals{
	void add();
	public default void communicate() { //DEFAULT METHOD ALSO HAVE PUBLIC ACCESS MODIFIER
		System.out.println("Sea animals communicate");
	}
}
class Dolphin implements SeaAnimals{
	@Override
	public void add() {
		System.out.println("Add dolphin");	
	}
	@Override
	public void communicate() {
		System.out.println("EHehhe");
	}
}
class Shark implements SeaAnimals{
	@Override
	public void add() {
		System.out.println("Add Shark");	
	}
	@Override
	public void communicate() {
		System.out.println("huuahahha");
	}
}
class Jhinga implements SeaAnimals{
	@Override
	public void add() {
		System.out.println("Add Jhinga");	
	}

}
public class DefaultMethodInInterface2 {

	public static void main(String[] args) {
		Dolphin d = new Dolphin();
		Shark s = new Shark();
		Jhinga j = new Jhinga();
		d.communicate();
		s.communicate();
		j.communicate();
	}
}
