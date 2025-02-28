package com.celcom.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExamp {
	public static void main(String[] args) {
		Set<String> st = new LinkedHashSet<String>();
		st.add("1");
		st.add("1");
		st.add("2");
		st.add("4");
		st.add("3");
		System.out.println(st);
		
			st.add(null);
	
			Set<String> st1 = new LinkedHashSet<>();
			Set<String> st2 = new HashSet<>();

			st1.addAll(st);
			st.add("12345");

//			st.clear();
			st.remove("123");
			System.out.println(st);
			System.out.println(st1);

			System.out.println(st.contains("Hello"));

			System.out.println(st.containsAll(st1));
			System.out.println(st.isEmpty());
			System.out.println(st.hashCode());

			System.out.println(st1.retainAll(st));
			System.out.println(st1);
			
			Iterator<String> it =st.iterator();
			while (it.hasNext()) {
				System.out.print(it.next()+ " ,");	
			}
	}
}
