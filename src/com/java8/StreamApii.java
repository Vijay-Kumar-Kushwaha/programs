package com.java8;

import java.util.function.Predicate;

public class StreamApii {
	public static void main(String[] args) {
		Predicate<Integer> p = i ->1%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(13));
	}

}
