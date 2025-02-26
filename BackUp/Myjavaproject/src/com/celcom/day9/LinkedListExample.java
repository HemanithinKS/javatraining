
package com.celcom.day9;                                                               

import java.util.ArrayList;                                                            
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;                                                                 
                                                                                       
public class LinkedListExample {                                                          
	public static void main(String[] args) {                                           
		List<Integer> list = new LinkedList();                                        
		List<Integer> list2 = new ArrayList<>();                                       
                                                                                       
		list.add(10);                                                                  
		list.add(30);                                                                  
		list.add(20);                                                                  
//		list.add("Java");                                                              
		list.add(10);                                                                  
		System.out.println(list);                                                      
                                                                                       
		System.out.println(list.get(0));                                               
		list.add(1, 15);                                                               
		System.out.println(list);                                                      
                                                                                       
		list.set(1, 150);                                                              
		System.out.println(list);                                                      
		                                                                               
		                                                                               
		System.out.println(list.size());                                               
		System.out.println(list.contains(10));                                         
                                                                                       
		System.out.println(list.equals(list2));                                        
		                                                                               
		System.out.println();                                                          
		//way-1                                                                        
		for (int i = 0; i < list.size(); i++) {                                        
			System.out.print(list.get(i)+ " ");                                        
		}                                                                              
		System.out.println();                                                          
		//way-2                                                                        
		for(Integer i : list) {                                                        
			System.out.print(i+ " ");                                                  
		}                                                                              
		System.out.println();                                                          
		                                                                               
		                                                                               
		//Way-3                                                                        
		Iterator<Integer> it = list.iterator();                                        
		while(it.hasNext()) {                                                          
			System.out.println(it.next());                                             
		}                                                                              
		
		
		
                                                                                       
	}                                                                                  
}                                                                                      
                                                                                       