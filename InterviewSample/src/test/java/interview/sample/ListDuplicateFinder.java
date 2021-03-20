package interview.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDuplicateFinder {
	
	public static void duplistfind(List<String> names) {
		Set<String> nameset = new HashSet<String>(); 
		Map<String, Integer> namemap = new HashMap<String, Integer>();
		
		for (String name : names) {
			nameset.add(name);
			if(namemap.containsKey(name))
			{
				namemap.put(name, namemap.get(name)+1);
			}else {
				namemap.put(name, 1);
			}
					
		}
		System.out.println(namemap);

		
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
        System.out.println();
        
        		
      
    }  
}  