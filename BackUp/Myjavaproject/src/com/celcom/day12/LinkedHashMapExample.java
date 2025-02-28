package com.celcom.day12;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
		lhmap.put(1, "one");
		lhmap.put(2, "two");
		lhmap.put(4, "four");
		lhmap.put(3, "three");
		lhmap.put(3, "three");
		lhmap.put(null, null);
		lhmap.put(null, null);
		

		lhmap.remove(1);
		
		System.out.println(lhmap.keySet());

		System.out.println(lhmap.values());

		// ways to print
		// way 1
		System.out.println(lhmap);
		// way 2
     	for (Map.Entry<Integer, String> entry : lhmap.entrySet()) {
		Integer key = entry.getKey();
 		String val = entry.getValue();
			System.out.print("{ " + key + " , " + val + " }");

		}
     	
		System.out.println("\n"+lhmap.containsKey(1)+" "+ lhmap.containsValue("one"));

		Map<Integer, String> lhmap2 = new  LinkedHashMap<Integer, String>();
		lhmap2.putAll(lhmap);

		System.out.println(lhmap2);

		lhmap.merge(3, "tree", (oldValue,newValue)-> {
			System.out.println(oldValue + " " + newValue);
			return oldValue;
			
		});

		// equals
		System.out.println(lhmap2.equals(lhmap));

		System.out.println(lhmap.get(1));

		System.out.println(lhmap.size());
		
	System.out.println(	lhmap.putIfAbsent(2,"one")); 
		
		System.out.println(lhmap);
		
		

	}
}
