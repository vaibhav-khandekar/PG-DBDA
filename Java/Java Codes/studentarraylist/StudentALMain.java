package studentarraylist;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int rollno;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	
	public Student() {
		super();
	}

	public Student(String name, int rollno, int m1, int m2, int m3, int m4, int m5) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}

	void getdata(ArrayList<Student> stuarr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter rollno");
		rollno = sc.nextInt();
		System.out.println("Enter marks 1(out 0f 10)");
		m1 = sc.nextInt();
		System.out.println("Enter marks 2 (out 0f 10)");
		m2 = sc.nextInt();
		System.out.println("Enter marks 3 (out 0f 10)");
		m3 = sc.nextInt();
		System.out.println("Enter marks 4 (out 0f 10)");
		m4 = sc.nextInt();
		System.out.println("Enter marks 5 (out 0f 10)");
		m5 = sc.nextInt();
		
		Student s = new Student(name,rollno,m1,m2,m3,m4,m5);
		
		int flag = 0;
		for(Student s1 : stuarr) 
		{
			if(s1.rollno == rollno) {
				System.out.println("Roll no already exists");
				flag =1;
			}
		}
		if(flag==0) {
			stuarr.add(s);
			System.out.println("Student added successfully");
		}
	}

	public void getpercentage(ArrayList<Student> stuarr) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no to calc perc:");
		int rno = sc.nextInt();
		int flag = 0;
		float total;
		float per;
		for(Student s1 : stuarr) {
			if(s1.rollno == rno) {
				flag = 1;
				total = s1.m1+s1.m2+s1.m3+s1.m4+s1.m5;
				per = (total / 50)*100;
				System.out.println("Percentage obtained : "+per);
			}
		}
		if(flag==0) {
			System.out.println("Student does not exist");
		}
		
		
	}
}
public class StudentALMain {

	public static void main(String[] args) {
	
		Student s = new Student();
		ArrayList<Student> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.add 2. display 3.percentage 4.exit");
			System.out.println("Enter choice");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				s.getdata(arr);
				break;
				
			case 2:
				for(Student student: arr) {
					System.out.println(student.name+" "+student.rollno);
				}
				break;
				
			case 3:
				s.getpercentage(arr);
				break;
				
			case 4:
				System.out.println("exit..");
				break;
			}	
		}while(ch!=4);
	}

}
