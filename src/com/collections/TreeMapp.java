package com.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapp {
	public static void main(String... args) {
		 TreeMap map = new  TreeMap();
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");
	        map.put(4, null);
	        map.put(5, null);
	        map.put(6, null);
	        System.out.println(map);
	        
//	        for (Object key : map.keySet()) {
//	            System.out.println("Key:   " + key+", values:   " + map.get(key));
//	        }
	        
	        Set s = map.entrySet();
	        Iterator itr = s.iterator();
	        while(itr.hasNext()) {
	        	System.out.println(itr.next());
	        }
	}
}

