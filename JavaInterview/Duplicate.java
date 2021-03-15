package trailtests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Duplicate {

	
	   public static void main(String[] args) { 
		    
		   
		   List <String> Companyname = new ArrayList<String>();
		   
		   Companyname.add("Vignesh");
		   Companyname.add("Vicky");
		   Companyname.add("DV");
		   Companyname.add("VD");
		   Companyname.add("Vicky");
		   Companyname.add("Vignesh");
		   
		   Map <String, Integer> dup = new TreeMap<String, Integer>();
		   Set<String> set1 = new HashSet<String>();
		   for (String name : Companyname) {
			   
			   set1.add(name);
			   
			   if(dup.containsKey(name)) {
				   dup.put(name,dup.get(name)+1 );
			   }else {
				   dup.put(name,1 );
			   }
		   }
		   
		   
		   for (String name : set1) {
			   
			   System.out.println(name+" = "+Collections.frequency(Companyname, name));
		   }
		   
		   
		   System.out.println(dup);
		   
		   
		  
	   
	   
	   
	   } 
	
	
}
