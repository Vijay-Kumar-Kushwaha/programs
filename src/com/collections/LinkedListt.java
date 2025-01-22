package com.collections;
import java.util.LinkedList;
public class LinkedListt {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20.5f);
		ll.add(30.5);
		ll.add('C');
		ll.add("VIJAY");
		ll.add(null);
		ll.add(null);
		ll.add(null);
		ll.add(null);
		ll.add(3, 7786786);
		System.out.println(ll);
	}
}
