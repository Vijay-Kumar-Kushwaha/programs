package ArrayOnline;

public class ArrayOperationTOSeeDifferencesAmongCollections {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		arr[3]= 4;
		arr[4]= 5;
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		arr[3]=30;
		arr[6] =60;
		for(int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}
	}

}
