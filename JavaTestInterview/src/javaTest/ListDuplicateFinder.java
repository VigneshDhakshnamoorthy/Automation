package javaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDuplicateFinder {
	
	public static void duplistfind(List<String> names) {
		Set<String> nameset = new HashSet<String>(); 
		
		for (String name : names) {
			nameset.add(name);
		
		}
		for (String named : nameset) {
			
			System.out.println(named+": "+Collections.frequency(names, named));
			
		}

	}

   
    public static void main(String a[]) {  
    	
    	List<String> names = new ArrayList<String>();
    	names.add("Vignesh");
    	names.add("Vicky");
    	names.add("Vignesh");
        ListDuplicateFinder.duplistfind(names);
        
        		
      
    }  
}  