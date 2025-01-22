package arrayTraversal2;

import java.util.Scanner;

public class SwapAdjacentArrayIndeces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		swappingIndexesInArray(arr);	
	}
	static void swappingIndexesInArray(int[] arr)	{
		for (int i = 0; i < arr.length-1; i+=2) {
			System.out.print(arr[i+1] + " " + arr[i] + " ");
		}
		if(arr.length % 2 != 0) {
			System.out.println(arr[arr.length - 1]);
		}
	}
}
