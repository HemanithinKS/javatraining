package com.celcom.day12;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "one");
		hmap.put(4, "four");
		hmap.put(3, "three");
		hmap.put(3, "tree");
		hmap.put(2, "two");
		hmap.put(null, "vbn");
		hmap.put(null, null);

//		hmap.remove(1);
//		
//		System.out.println(hmap.keySet());
//
//		System.out.println(hmap.values());
//
//		// ways to print
//		// way 1
//		System.out.println(hmap);
//		// way 2
//     	for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
//		Integer key = entry.getKey();
// 		String val = entry.getValue();
//			System.out.print("{ " + key + " , " + val + " }");
//
//		}
//
//		System.out.println(hmap.containsKey(1)+" "+ hmap.containsValue("one"));
//
//		Map<Integer, String> hmap2 = new HashMap<Integer, String>();
//		hmap2.putAll(hmap);
//
//		System.out.println(hmap2);
//
//		hmap.merge(3, "tree", (oldValue,newValue)-> {
//			System.out.println(oldValue + " " + newValue);
//			return oldValue;
//			
//		});
//
//		// equals
//		System.out.println(hmap2.equals(hmap));
//
//		System.out.println(hmap.get(1));
//
//		System.out.println(hmap.size());
//		
//	System.out.println(	hmap.putIfAbsent(2,"one")); 
//		
		System.out.println(hmap);
		
		

	}
}
