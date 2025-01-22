package ArrayOnline;

import java.util.Scanner;

public class MaximumSumPair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int res = maxSumPair(arr);
		sc.close();
		System.out.println(res);
	}
	static int maxSumPair(int[] arr)	{
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > firstLargest)	{
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
			else if(arr[i] > secondLargest)	{
				secondLargest = arr[i];
			}			
		}
		return firstLargest + secondLargest;
	}

}































