package com.subArrays;

import java.util.Scanner;

public class SubArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int size = sc.nextInt();
		printSubArrays(arr, size);
	}
	/*static void printSubArrays(int[] arr, int size) {
		for(int i = 0; i <=arr.length-size; i++)	{
			for(int j = i; j < i+size; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}*/
	
	static void printSubArrays(int[] arr, int size) {
		for(int i = 0; i <= arr.length-size; i++)	{
			int count = 0;
			for(int j = i; j < arr.length; j++)	{
				System.out.print(arr[j] + " ");
				count++;
				if(count ==size)	{
					break;
				}
			}
			System.out.println( );
		}
	}
}
