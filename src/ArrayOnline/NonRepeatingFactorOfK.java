package ArrayOnline;

import java.util.Scanner;

public class NonRepeatingFactorOfK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		nonRepeatingFactorOfK(arr, k);
	}
	static void nonRepeatingFactorOfK(int[] arr, int k)	{
		boolean found = false;
		for(int i = 0; i < arr.length; i++)	{
			int count = checkOccurrence(arr,arr[i]); 
			if(count == 1 && k % arr[i] == 0)	{
				System.out.println(arr[i]+ " ");
				found = true;
				
			}
			
		}
		if(!found)	{
			System.out.println("No factors found");
		}
	}
	static int checkOccurrence(int[] arr, int val)	{
		int count = 0;
		for(int i = 0; i < arr.length; i++ )	{
			if(val == arr[i])	{
				count++;
			}
		}
		return count;
	}
}


//you are given a sentence consisting of severaal words. your task is to print all the words whose length is greater than 3 .
//the output should maintain original order of the words as they appeared in the input
//
//sample input: Hello Bob What are you doing?
//sample output: Hello What doing		
