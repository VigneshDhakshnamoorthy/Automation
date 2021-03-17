package javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SortArray {
	 public static int findIndex(int arr[], int t)
	    {
	 
	        int index = Arrays.binarySearch(arr, t);
	        return (index < 0) ? -1 : index;
	    }
	public static void main(String[] args) {
		
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, -4, 6, 55, -20, -65};  
		int[] newArr = new int[arr.length];
		System.out.println("Array elements after sorting:");  
		//sorting logic  
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		System.out.print(arr[i]);
		System.out.print(" ");
		}  	
			
		System.out.println();
		for (int i = 0; i < arr.length; i++)   
		{ 
			if (arr[i]<0) {
				newArr[i] = arr[i]*-1;
			}else {
				newArr[i] = arr[i];
			}
		}
		Arrays.sort(newArr);
		for (int i = 0; i < newArr.length; i++)   
		{
			System.out.print(newArr[i]);
			System.out.print(" ");
			
			
		}
	
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++)   
		{ 
			arrList.add(arr[i]);
		}
		
		
		for (int i = 0; i < newArr.length; i++)   
		{
		
			if (arrList.contains(newArr[i]) )
			{
				continue;
			}
			else
			{
				newArr[i] = newArr[i]*-1;
			}
			
			
		}
		System.out.println();
		for (int arrl : newArr)   
		{
			System.out.print(arrl);
			System.out.print(" ");
			
			
		}
		
		
		}
		
		
	  
}


