package ArrayOnline;

import java.util.Scanner;

public class LastOccurenceIndexFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++)	{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int res = lastOccIndexFind(arr, k);
		System.out.println(res);
	}
	
	static int lastOccIndexFind(int[] arr, int k){
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == k)	{
				result = i;
			}			
		}
		return result;				
	}
}
