package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCollectionTypeConstructor {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		ArrayList al = new ArrayList(ll);
		System.out.println(al);
	}

}
