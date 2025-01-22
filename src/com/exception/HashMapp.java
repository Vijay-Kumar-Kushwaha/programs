package com.exception;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapp {
	public static void main(String... args) {
		 HashMap<Integer, String> map = new HashMap<>();
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");

	        for (Integer key : map.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + map.get(key));
	        }
	}
}
