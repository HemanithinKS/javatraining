package com.celcom.day12;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<String> st = new TreeSet<String>();
		st.add("1");
		st.add("1");
		st.add("2");
		st.add("4");
		st.add("3");
		try {
			st.add(null);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println();
		}
		System.out.println(st);
		try {
			st.add(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}
