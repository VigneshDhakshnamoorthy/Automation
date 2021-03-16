package javaTest;

import java.util.Scanner;

public class Fibonacci {

	public static void fibon() {
		
		int c = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = scan.nextInt();
		System.out.println("Enter Second Number : ");
		int b = scan.nextInt();
		System.out.println("Enter Rows Number : ");
		int row = scan.nextInt();
	

		for (int i=0; i<row; i++) {
			System.out.println(a);
			c = a+b;
			a = b;			
			b = c;
			
		}


	}

	public static void main(String[] args) {
		Fibonacci.fibon();
	}
}
