package UST_global;

import java.util.ArrayList;

public class UST_demo {
	public static void main(String[] args) {
		String country = "Australia/India/Sri Lanka/Germany/Denmerk/Japan";
		ArrayList<String> countr = new ArrayList<String>();
		String[] split = country.split("/");
		for ( String sp : split) {
			if (!sp.equalsIgnoreCase("Germany")) {
				countr.add(sp);
			}
		
		}
		
		for ( String sp2 : countr) {
			System.out.println(sp2);
			
		}
	}

}
