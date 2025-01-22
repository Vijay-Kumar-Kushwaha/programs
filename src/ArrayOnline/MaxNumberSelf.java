package ArrayOnline;

import java.util.Scanner;

public class MaxNumberSelf {
	static void largestArrayNumber(int[] arr) {
			int i;
			int max = arr[0];
			for(i=1; i<arr.length; i++) 
				if (arr[i]>max) 
					max=arr[i];
				
				System.out.println(max);
			
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the araay to find max Array element");
		for(int i = 0; i<n; i++)
			arr[i]=sc.nextInt();	
		largestArrayNumber(arr);
		sc.close();
	}

}
