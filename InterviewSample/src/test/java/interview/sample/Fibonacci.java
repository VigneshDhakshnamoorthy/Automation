package interview.sample;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Fibonacci {


	@Test
	public static void fibon() {

		int c = 0;
		@SuppressWarnings("resource")
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

}
