package com.sort.comparator;

import java.util.Comparator;

public class Person {
	
private int id;
private int age;
private String name;
private String designation;

public Person(int id, int age, String name, String designation) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.designation = designation;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

@Override
public String toString() {
	return "Person [id=" + id + ", age=" + age + ", name=" + name + ", designation=" + designation + "]";
}

public static Comparator<Person> NameComparator = new Comparator<Person>(){
	
	public int compare(Person p1, Person p2) {
		String n1 = p1.getName().toUpperCase();
		String n2 = p2.getName().toUpperCase();
		
		return n1.compareTo(n2);
		
		
		
	}
};
 public static Comparator<Person> AgeComparator = new Comparator<Person>(){
	 
	 public int compare(Person p1, Person p2) {
		 
	 int a1 = p1.getAge();
	 int a2 = p2.getAge();
	 
	 return a1 - a2;
		 
	 }
	 
 };
}
