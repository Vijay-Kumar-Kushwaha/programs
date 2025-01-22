package ArrayOnline;

public class maxNumber {
	
	static int[] arr = {12,3,4,4564,342,234,23,3,234,};
	static int largest() {
		int i;
		int max = arr[0];
		for(i=1; i<arr.length; i++) 
			if (arr[i]>max) 
				max=arr[i];
			
			return max;
		
	}
	public static void main(String[] args) {
		 	 	System.out.println("largest element in array is: "+largest());
	}

}
