package trailtests;

import java.util.Scanner;

public class Fibonaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ROWS: ");
		int rows = sc.nextInt();
		System.out.print("Enter Number 1: ");
		int i = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int j = sc.nextInt();
		// 0 1 1 2 3 5
		
		int k;
		
		for (int l=1;l<=rows;l++) {
		
			System.out.println(i);
			k=i+j;
			i=j;
			j=k;
			
			
		}
	}

}
