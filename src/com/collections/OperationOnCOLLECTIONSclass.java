package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class OperationOnCOLLECTIONSclass {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(78);	
		al.add(32);	
		al.add(745);	
		al.add(745);	
		al.add('v');	
		al.add(323);
		
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		System.out.println(Collections.frequency(al, 745));
		
		Collections.sort(al);
		System.out.println(al);
		
	}
}
