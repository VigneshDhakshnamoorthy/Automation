package java.samples;

public class PrimeNumber {
	
	public static void prime() {
		int counter = 0;
		System.out.println("Prime Numbers");
		for ( int i = 1 ; i < 100 ; i++) {
			if ( i%2 != 0) {
				if (i%3 !=0 || i ==3) {
					if (i%5 !=0 || i ==5) {
						if (i%7 !=0 || i ==7) {
							System.out.println(i);
							counter++;
								}
						}
				}
			
			}
		}
		
		System.out.println("Total Prime Numbers : " + counter);
	}
	
	public static void main(String[] args) {
		PrimeNumber.prime();
	}
}
