package com.celcom.day13;

public class SameArray {
	static <T> boolean same(T arr1[],T arr2[] ) {
		if (arr1.length == arr2.length ) {
			for (int i = 0; i < arr2.length; i++) {
				if (!(arr1[i].equals(arr2[i]))) {
					return false;
				}
			}
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Integer arr1[]= {1,2,3,4,5};
		Integer arr2[]= {1,2,3,4,5};
		
		Character arrA[]= {'A','B','C','D'};
		Character arrB[]= {'A','B','C','D'};
		
		System.out.println(same(arr1, arr2));
		System.out.println(same(arrA, arrB));
	}
}
