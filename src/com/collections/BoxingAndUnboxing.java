package com.collections;

import java.util.ArrayList;

public class BoxingAndUnboxing {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(100);
		Integer i = Integer.valueOf(123);
		int b = i;
		al.add(b);
		int c = 234;
		al.add(c);
		System.out.println(al);
	}
}