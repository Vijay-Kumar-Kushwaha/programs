//package com.java8;
//@FunctionalInterface
//interface MyFunctionalInterface1 {
//    void show();  // Single abstract method
//
//    default void greet() {
//        System.out.println("Hello from Default Method!");
//    }
//
//    static void info() {
//        System.out.println("This is a Static Method in Functional Interface.");
//    }
//}
//class Hello implements MyFunctionalInterface1{
//	@Override
//	public void show() {
//		System.out.println("Say Hello from implementing class");
//	}
//}
//public class FunctionalInterfaceGPT {
//    public static void main(String[] args) {
////        MyFunctionalInterface1 obj = () -> System.out.println("Lambda Execution");
//    	Hello obj = new Hello();
//        obj.show();  // Lambda execution
//
//        obj.greet();  // Calling default method
//        MyFunctionalInterface1.info();  // Calling static method
//    }
//}














package com.java8;
@FunctionalInterface
interface MyFunctionalInterface1 {
    void show();

    default void greet() {
        System.out.println("Hello from Default Method!");
    }

    static void info() {
        System.out.println("This is a Static Method in Functional Interface.");
    }
}
class Hello implements MyFunctionalInterface1{
	@Override
	public void show() {
		System.out.println("Say Hello from implementing class");
	}
}
public class FunctionalInterfaceGPT {
    public static void main(String[] args) {
    	Hello obj = new Hello();
        obj.show();
        obj.greet();
        MyFunctionalInterface1.info();
    }
}
