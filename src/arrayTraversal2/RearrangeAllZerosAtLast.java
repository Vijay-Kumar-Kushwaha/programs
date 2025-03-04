package arrayTraversal2;

import java.util.Scanner;

public class RearrangeAllZerosAtLast {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		rearrangeAllTheZerosAtLast(arr);
	}
	static void rearrangeAllTheZerosAtLast(int[] arr){
		int i =0, j =0;
		while(i<arr.length) {
			if(arr[i]==0) {
				i++;
			}
			else {
				arr[j] = arr[i];
				i++;
				j++;
			}
		}
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		for(int k = 0; k < arr.length; k++ ) {
			System.out.println(arr[k]);
		}
	}
}
