
//Question
/*Create a class `Computer` having a public method `playGames()`. Create 3
classes: `Laptop`, `Desktop` and `Mobile`. Establish a is-A relationship
between `Computer` and `Laptop`, `Desktop`, `Mobile`. Now override the
inherited method in all the subclasses based on their performance*/

package com.inheritance;

class Computer{
	public void playGames() {
		System.out.println("Playing games in the computer");
		
	}
}
class Laptop extends Computer{
	@Override
	public void playGames() {
		System.out.println("Playing Games in the laptop");
	}
	
}

class Desktop extends Computer{
	@Override
	public void playGames() {
		System.out.println("Playing Games in the desktop");
	}
	
}

class Mobile extends Computer{
	@Override
	public void playGames() {
		System.out.println("Playing Games in the mobile");
	}
	
}
public class AsgnProgram3 {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.playGames();
		Desktop d = new Desktop();
		d.playGames();
		Mobile m = new Mobile();
		m.playGames();
	}

}
