package arrayTraversal2;

import java.util.Scanner;

public class RearrangeNegativeOnessAtStarting {
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
		int[] res = new int[arr.length];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]== -1) {
				res[index] = -1;   
				index++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != -1) {
				res[index] = arr[i];
				index++;
			}
		}
		for(int i = 0; i <res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
