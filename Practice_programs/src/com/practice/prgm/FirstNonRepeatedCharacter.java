package com.practice.prgm;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String input = "i am going for an interview";
		
		for(char i : input.toCharArray()){
			if(input.indexOf(i)==input.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: "+i);
	            break;
			}
		}
	}

}
