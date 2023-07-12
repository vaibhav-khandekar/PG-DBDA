package comparatorandComparable;

import java.util.ArrayList;
import java.util.Collections;

// comparable interface
// used when we have to sort only one attribute
// it has the compareTo method
// sorts the list using Collections.sort(list_name)

// below program sorts object based on age

// if we want to sort both name and age in single code , that is not possible in comparable interface

class Student implements Comparable<Student>{
	int rollNo;
	String name;
	int age;
	
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	// if we want to sort the objects according to a String field "name"
	
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

//	@Override
//	public int compareTo(Student o) {
//		if(this.age > o.age) {
//			return 1;
//		}
//		else if(this.age < o.age) {
//			return -1;
//		}
//		return 0;
//	}
	
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(105,"Sia",27);
		Student s2 = new Student(104,"Pia",22);
		Student s3 = new Student(103,"Ria",25);
		Student s4 = new Student(102,"Tia",21);
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.rollNo+" "+s.name+" "+s.age);
		}
	}

}
