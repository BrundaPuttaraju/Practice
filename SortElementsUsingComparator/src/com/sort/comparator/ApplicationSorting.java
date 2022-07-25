package com.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationSorting {
	
	public static void main(String[] args) {
		
		List<Person> employees = new ArrayList<Person>();
		
		employees.add(new Person(1,24,"Joe","Clerk"));
		employees.add(new Person(5,26,"Clark","Developer"));
		employees.add(new Person(9,27,"Bob","Accountant"));
		employees.add(new Person(3,30,"Maggi","Manager"));
		
		//Using Java 8
		
		List<Person> l1 = employees.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
				System.out.println(l1);
		List<Person> l2 = employees.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
		        System.out.println(l2);
		
		//Using java 7
		System.out.println("Employees Name Sorting:");
		
		Collections.sort(employees, Person.NameComparator);
		
		for(Person emp : employees) {
			
			 System.out.println(emp);
		}

		System.out.println("Employees Age Sorting:");
		
		Collections.sort(employees,Person.AgeComparator);
		
		for(Person emp1 : employees) {
			
			 System.out.println(emp1);
		}
	}

}
