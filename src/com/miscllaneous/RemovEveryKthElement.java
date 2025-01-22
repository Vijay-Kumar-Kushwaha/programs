package com.miscllaneous;

import java.util.Scanner;

public class RemovEveryKthElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)	{
			arr[i] = sc.nextInt();			
		}
		int k = sc.nextInt();
		removeKthElement(arr, k);
	}
	static void removeKthElement(int[] arr, int k)	{
		k = k-1;
		for (int i = 0; i < arr.length; i++) {
			if(i != k) {
				System.out.println(arr[i] + " ");
			}
		}
		
	}
}
