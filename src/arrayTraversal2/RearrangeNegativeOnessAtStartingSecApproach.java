package arrayTraversal2;

import java.util.Scanner;

public class RearrangeNegativeOnessAtStartingSecApproach {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		rearrangeTheNegativeOnesValue(arr);
	}
	static void rearrangeTheNegativeOnesValue(int[] arr){
		int i =arr.length-1, j = arr.length-1;
		while(i>=0) {
			if(arr[i]==-1) {
				i--;
			}
			else {
				arr[j] = arr[i];
				i--;
				j--;
			}
		}
		while(j>=0) {
			arr[j]=-1;
			j--;
		}
		for(int k = 0; k < arr.length; k++ ) {
			System.out.println(arr[k]);
		}
	}
}
