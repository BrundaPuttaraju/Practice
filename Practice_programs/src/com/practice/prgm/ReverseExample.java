package com.practice.prgm;

public class ReverseExample {

	public static void main(String[] args) {
		
		String str = "Java Collections";
		
		char[] ch = str.toCharArray();
		
		String rev = "";
		
		for(int i = ch.length-1;i>=0;i--) {
			
			rev = rev + ch[i];
		}
		System.out.println(rev);
		
		int num = 5161186;
		int rev1 = 0;
		while(num!=0) {
			
		int last = num%10;	
		 
		rev1 = rev1*10 + last;
		
		
		num = num / 10;
		 }
		
		System.out.println(rev1);
	}
	

}
