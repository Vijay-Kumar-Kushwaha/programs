package String;

class Dog{
	String name;
	int price;
}
class Cat{
	String name;
	int price;
}

public class CreateUserDefineArray {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog[] arr1 = new Dog[3];
		arr1[0] = d1;
		arr1[1] = d2;
		arr1[2] = d3;
		d1.name = "jackie";
		d1.price = 4000;
		d2.name = "sheru";
		d2.price = 5000;
		d3.name = "mallow";
		d3.price = 6000;
		System.out.println(arr1[0].name);
		System.out.println(arr1[0].price);
		System.out.println(arr1[1].name);
		System.out.println(arr1[1].price);
		System.out.println(arr1[2].name);
		System.out.println(arr1[2].price);
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		Cat[] arr2 = new Cat[3];
		arr2[0] = c1;
		arr2[1] = c2;
		arr2[2] = c3;
		c1.name = "Lucy";
		c1.price = 100;
		c2.name = "micky";
		c2.price = 300;
		c3.name = "pussy";
		c3.price = 300;
		System.out.println("_--_--_--_--_--_--_--_--_--_--_--_--_--_");
		System.out.println(arr2[0].name);
		System.out.println(arr2[0].price);
		System.out.println(arr2[1].name);
		System.out.println(arr2[1].price);
		System.out.println(arr2[2].name);
		System.out.println(arr2[2].price);

	}

}
