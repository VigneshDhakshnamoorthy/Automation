package trailtests;

import java.util.Scanner;

public class pyramid {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int rows = sc.nextInt();
		
		// 5*2-1
		//5-1
		
		// 
  
		for ( int i = 1 ; i<=rows;i++) {
		
			for (int k=1;k<=rows-i;k++) {
				
			System.out.print(" ");
			
			}
			for ( int j =1; j<=i*2-1;j++) {
							
			System.out.print("*");
			}
			System.out.println();
		}
			
		for ( int i = rows ; i>=1;i--) {
			
			for (int k=rows-i;k>=1;k--) {
				
			System.out.print(" ");
			
			}
			for ( int j =i*2-1; j>=1;j--) {
							
			System.out.print("*");
			}
			System.out.println();
		}
		
}
}