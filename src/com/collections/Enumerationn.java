package com.collections;

import java.util.Enumeration;
import java.util.Stack;

public class Enumerationn {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(12);
		s.add(452);
		s.add(23);
		s.add(345);
		Enumeration e = s.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
