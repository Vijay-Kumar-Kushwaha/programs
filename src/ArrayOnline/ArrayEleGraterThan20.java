 package ArrayOnline;

import java.util.Scanner;

public class ArrayEleGraterThan20 {
	
	static void findGreaterNumberThan20(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			System.out.println(max);
		}
		
	}
	static void printElementGreaterThanTwenty20(int[] arr){
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>20) {
				System.out.println(arr[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		findGreaterNumberThan20(int[] arr);
//		printElementGreaterThanTwenty20(int[] arr);
		sc.close();

	}

}
