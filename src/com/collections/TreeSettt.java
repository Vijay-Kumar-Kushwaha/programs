package com.collections;

import java.util.TreeSet;

public class TreeSettt {

	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		System.out.println(ts.ceiling(185));
	}
}	
