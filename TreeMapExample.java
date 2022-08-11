package org.practice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	
	    
	public static void main(String args[]) 
	
	{    
		
	//object of TreeMap class 
		
	TreeMap<String,String> treemap = new TreeMap<String,String>();  
	
	  
	//adding elements to the TreeMap  
	
	treemap.put("H","Ahmedabad ");      
	treemap.put("D","Jaipur");      
	treemap.put("B","Delhi");      
	treemap.put("F","Agra");   
	treemap.put("P","Patna");  
	
	//for-each loop for fetching the elements from the TreeMap 
	
	for(Map.Entry m:treemap.entrySet())  
		
	{      
		
	//prints the key and value pair of the elements  
		
	System.out.println(m.getKey()+" "+m.getValue());      
	}      
	 
	}  

}
