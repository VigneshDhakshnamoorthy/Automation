package interview.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class check_two_list {
	public static void main(String[] args) {
		
		String name = "aaaabbbccd";
		char[] array_char = name.toCharArray();
	 	List<Character> list_name = new ArrayList<Character>();
	 	Set<Character> set_name = new HashSet<Character>();
	    for (char c : array_char) {
	    	list_name.add(c);
	    	set_name.add(c);
	    }
	    for (char s : set_name) {
	    	System.out.println(s+"="+Collections.frequency(list_name,s));
	    }
}
}
