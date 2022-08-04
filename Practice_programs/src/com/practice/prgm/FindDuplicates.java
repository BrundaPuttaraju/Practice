package com.practice.prgm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		int[] integers = { 1, 2, 2, 3, 4, 4, 4 };
		for (int i = 0; i < integers.length; i++) {
			for (int j = i + 1; j < integers.length-1; j++) {
				if (integers[i] == integers[j]) {
					System.out.println(integers[j]);
				}
			}
		}
	
	
		
		for (Integer intlist: integers) {
			if (set.add(intlist) == false) 
			{ System.out.println("found a duplicate element in array : " + intlist); }
		}

		
	
	}}
