package com.practice.prgm;

import java.util.HashMap;

public class CountOfCharInString {
	static void getcount(String str) {
		
		HashMap<Character, Integer> chcount = new HashMap<Character, Integer>();
		  
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			
			if(chcount.containsKey(c)) {
				
				chcount.put(c, chcount.get(c)+1);
			}
			
			else {
				chcount.put(c,1);
			}
		}
		
		System.out.println(str + " : "+ chcount);
		
		}
	public static void main(String[] args) {
		
		getcount("aabbccaabbccaa");
	}

}
