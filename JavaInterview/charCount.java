package trailtests;

public class charCount {

	public static void main(String[] args) {

		int i;
		
		//Reverse the name
		String My = "vignesh";
		int Length = My.length();
		for ( i = Length-1 ; i>=0;i--)
		{
			System.out.println(My.charAt(i));
		}
		//Reverse the name
		
		
		
		//duplicate character
		String Name = "aaaa";
		int counter[] = new int[256];
		
		
		for ( i =0; i<Name.length();i++) {

			counter[(int) Name.charAt(i)]++;
			

		}

		for ( i =0 ; i < 256 ;i++ ) {
			if (counter[i] != 0) {
				System.out.println((char) i  + " == " + counter[i] );
				
			}
		}
		//duplicate character
		
		
		
		
	}

}
