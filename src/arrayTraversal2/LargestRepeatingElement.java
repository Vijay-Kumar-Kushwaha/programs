package arrayTraversal2;

import java.util.Scanner;

public class LargestRepeatingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int res = largestRepeatingElement(arr);
		System.out.println(res);
		sc.close();
	}
	
	static int largestRepeatingElement(int[] arr)	{
		for (int i = arr.length - 2; i >= 0; i--) {
			if(arr[i] == arr[i+1]){
				return arr[i];
			}			
		}
		return Integer.MIN_VALUE;
	}

}
