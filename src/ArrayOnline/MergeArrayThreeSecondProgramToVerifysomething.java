package ArrayOnline;

import java.util.Scanner;

public class MergeArrayThreeSecondProgramToVerifysomething {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int n3 = sc.nextInt();
		int[] arr3 = new int[n3];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = sc.nextInt();
		}
		System.out.print("Merged array:");
		int[] res = mergeArray(arr1, arr2, arr3);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
	static int[] mergeArray(int[] arr1, int[] arr2, int[] arr3)	{
		int[] res = new int[arr1.length + arr2.length + arr3.length];
        int i = 0, j = 0, k = 0, l = 0;

        // Loop through all arrays
        while (i < arr1.length || j < arr2.length || k < arr3.length) {
			if(i < arr1.length)	{
				res[l++] = arr1[i++];
			}
			if(i < arr2.length)	{
				res[l++] = arr2[i++];
			}
			if(i < arr3.length)	{
				res[k++] = arr3[i++];
			}
		}
		return res;
	}
	
	

}