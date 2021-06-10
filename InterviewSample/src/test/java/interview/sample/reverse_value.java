package interview.sample;

import java.util.Scanner;

public class reverse_value {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = value.nextInt(), num = number;
		int reverse = 0;
		while ( number != 0) {
			int remain = number % 10;
			reverse = reverse*10 + remain;
			number /= 10;
		}
		System.out.println("Value : "+num+"  Reverse : "+reverse);
		
		
		@SuppressWarnings("resource")
		Scanner name = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String word = name.next();
		char[] words = word.toCharArray();
		int length = words.length-1;
		
		StringBuffer Reverse=new StringBuffer();
		
		for ( int i = length; i >= 0 ; i--) {
			
			Reverse.append(words[i]);
		}
		System.out.println("Name : "+word+"  Reverse : "+Reverse);
	}

}
