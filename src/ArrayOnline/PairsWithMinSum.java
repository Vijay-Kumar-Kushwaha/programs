package ArrayOnline;

import java.util.Scanner;

public class PairsWithMinSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		pairWithMinSum(arr);
	}
	static void pairWithMinSum(int[] arr) {
		int max = Integer.MIN_VALUE, sum =0;
		int pair1 = Integer.MAX_VALUE, pair2 = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] +arr[j] < max)	{
					pair1 = arr[i];
					pair2 = arr[j];
					sum = arr[i] + arr[j];
					max = sum;
				}
			}
		}
		System.out.println(pair1 + " " + pair2);
	}

}
