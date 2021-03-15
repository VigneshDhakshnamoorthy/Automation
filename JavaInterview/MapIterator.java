	package trailtests;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {
	public static void main(String[] args) {
		HashMap <String, Integer> emp = new HashMap<String, Integer>();
		emp.put("A", 100);
		emp.put("B", 200);
		emp.put("c", 300);
		emp.put("D", 400);
		emp.put("E", 500);
		
		
		for (Map.Entry<String, Integer> empsal : emp.entrySet()) {
			String Name  = "||| Name : "+empsal.getKey()+" ||| Salary : "+empsal.getValue()+" |||";
			System.out.println(Name);
		
			for (int i =0 ; i< Name.length();i++) {
				System.out.print("-");
			}
			System.out.println();
		
		}
	}

}
