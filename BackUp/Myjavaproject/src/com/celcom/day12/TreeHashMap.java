package com.celcom.day12;


import java.util.Map;
import java.util.TreeMap;

public class TreeHashMap {
	public static void main(String[] args) {
		Map<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "one");
		tmap.put(2, "two");
		tmap.put(4, "four");
		tmap.put(3, "three");
		tmap.put(3, "three");
		tmap.put(7, null);
		tmap.put(8, null);
		
		

		System.out.println(tmap.remove(1));
		
		System.out.println(tmap.keySet());

		System.out.println(tmap.values());

		// ways to print
		// way 1
		System.out.println(tmap);
		// way 2
     	for (Map.Entry<Integer, String> entry : tmap.entrySet()) {
		Integer key = entry.getKey();
 		String val = entry.getValue();
			System.out.print("{ " + key + " , " + val + " }");

		}
     	
		System.out.println("\n"+tmap.containsKey(1)+" "+ tmap.containsValue("one"));

		Map<Integer, String> tmap2 = new TreeMap<Integer, String>();
		tmap2.putAll(tmap);

		System.out.println(tmap2);

		tmap.merge(3, "tree", (oldValue,newValue)-> {
			System.out.println(oldValue + " " + newValue);
			return oldValue;
			
		});

		// equals
		System.out.println(tmap2.equals(tmap));

		System.out.println(tmap.get(1));

		System.out.println(tmap.size());
		
	System.out.println(	tmap.putIfAbsent(2,"one")); 
		
		System.out.println(tmap);
		
		

	}
}
