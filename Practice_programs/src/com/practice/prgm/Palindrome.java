package com.practice.prgm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str,rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check the palindrome");
		str = sc.nextLine();
		int length = str.length();
		for(int i = length-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
    
    if(str.equals(rev)) 
    	System.out.println("Entered string/number is a palindrome.");
    else
    	System.out.println("Entered string/number is not a palindrome.");
	}

}
