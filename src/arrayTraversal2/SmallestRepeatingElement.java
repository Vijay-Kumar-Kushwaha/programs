package arrayTraversal2;

import java.util.Scanner;

 class occurenceOfLargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int res = occurenceOfLargestElement(arr);
		System.out.println(res);
		sc.close();
	}
	static int occurenceOfLargestElement(int[] arr)	{
		int count=1;
		for (int i = arr.length-1; i >= 1; i++) {
			if (arr[i] == arr[i-1]) {
				count++;				
			}
			return count;
		}
		return -1;
	}
}
