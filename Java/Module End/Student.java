package com.cdac.main;

class Person {
	String name;
	int age;
	
	Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("name = "+this.name);
		System.out.println("age = "+this.age);
	}
}

public class Student extends Person {
	
	char grade;
	
	Student(char grade,String name,int age){
		super(name,age);
		this.grade = grade;
		System.out.println("grade = "+this.grade);
	}
	
	Student(String name,int age){
		super(name,age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("vaibhav", 22);
		System.out.println();
		Student s2 = new Student('A', "Surya", 25);
	}
}