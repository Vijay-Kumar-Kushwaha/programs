package com.java8;



interface MyInterface2 {
    void show();
    void hello();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Creating an instance using an anonymous inner class
        MyInterface2 obj = new MyInterface2() {
            public void show() {
                System.out.println("Hello from Anonymous Inner Class! method 1");
            }
            public void hello() {
            	System.out.println("Hello from Anonymous Inner Class method 2!");
            	
            }
        };
        obj.show();
        obj.hello();
    }
}
