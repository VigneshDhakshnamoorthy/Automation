package javaTest;

import java.util.Arrays;

public class SortArray {

	
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {78, 34, 1, 3, 90, -4, 6, 55, -20, -65, -1};  
		int[] newArr = new int[arr.length+1];
		int[] newArr2 = new int[arr.length];
		System.out.println(" Normal Array ");
		for ( int i =0 ; i <arr.length;i++) {
			if(arr[i]>0) 
			{
				newArr[i]=arr[i];
			}else {
				newArr[i]=arr[i]*-1;
			}
		
		}
		for (int a : arr) {
			System.out.print(a);
			System.out.print(" ");
		}
		System.out.println();
		Arrays.sort(newArr);
		System.out.println(" Sorted Array ");
		for (int a : newArr) {
			System.out.print(a);
			System.out.print(" ");
		}
		System.out.println();
		for (int ab : arr) {
			if (Arrays.binarySearch(newArr, ab)>=0) {
			

			newArr[Arrays.binarySearch(newArr, ab)]=ab;

			}
			else {

				newArr[Arrays.binarySearch(newArr, ab*-1)]=ab;
	
		
			}
		}
		System.out.println(" Final Array ");
		for (int a : newArr) {
			System.out.print(a);
			System.out.print(" ");
		}

		
	
	}

	  
}


