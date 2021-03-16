package javaTest;

public class ArmstrongNumber {
	
	public static void ArmStro(int a) {
		
		double sum =0;
		String num = Integer.toString(a);
		char[] numc = num.toCharArray();
		for ( char numca : numc) {
			int numci = Character.getNumericValue(numca);
			sum = sum + (Math.pow(numci, num.length()));
		}
		if ( a == sum ) {
			System.out.println(a+" is Armstrong Number");
			
		} 
		
	}
	
	public static void main(String[] args) {
		for ( int i = 10 ; i<10000 ; i++)
		{
		ArmstrongNumber.ArmStro(i);
			}
		}
	

}
