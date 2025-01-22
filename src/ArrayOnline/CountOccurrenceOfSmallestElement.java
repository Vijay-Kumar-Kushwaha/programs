package ArrayOnline;

import java.util.Scanner;

public class CountOccurrenceOfSmallestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)	{
			arr[i] = sc.nextInt();
		}
		int res = countOccurrenceOfSmallestElementInArray(arr);
		System.out.println(res);				
	}
	static int countOccurrenceOfSmallestElementInArray(int[] arr) {
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[0] == arr[i]) {
				count++;
			}
			else {
				return count;
			}
		}
		return -1;
	}
}
