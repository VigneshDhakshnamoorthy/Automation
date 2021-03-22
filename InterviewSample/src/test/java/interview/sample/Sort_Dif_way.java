package interview.sample;

public class Sort_Dif_way {
	public static void main(String[] args) {
		int[] arr = new int[] {78, 34, 1, 3, 90, -4, 6, 55, -20, -65, -1};  
		int temp;
		for ( int i = 0 ; i < arr.length ; i++) {
			for ( int j = 0 ; j < arr.length; j++) {
				
				if ( arr[i] < arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}else {
					continue;
						}
		}

		}
		for ( int k = 0 ; k < arr.length ; k++) {

			System.out.print(arr[k]+" ");

		}
	}

}
