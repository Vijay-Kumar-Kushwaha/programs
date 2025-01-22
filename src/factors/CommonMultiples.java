package factors;

import java.util.Scanner;

public class CommonMultiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++)	{
			arr[i] = sc.nextInt();
		}
		sc.close();
		smallestArrayElement(arr);				
	}
	static void smallestArrayElement(int[] arr)	{
		if(arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		int min = arr[0];
		for(int i = 1; i < arr.length; i++)	{
			if(arr[i]<min)	{
				min = arr[i];
			}
		}
		System.out.println(min);
		
	}
}
