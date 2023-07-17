package studentsubject_array;

import java.util.Scanner;

class StudentSubject{
	String subjectName;
	int totalCredits;
	int obtainedCredits;
	
	public StudentSubject() {
		
	}
	
	public StudentSubject(String subjectName,int totalCredits,int obtainedCredits) {
		this.subjectName = subjectName;
		this.totalCredits = totalCredits;
		this.obtainedCredits = obtainedCredits;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter subject name");
		subjectName = sc.next();
		System.out.println("Enter total credits");
		totalCredits = sc.nextInt();
		System.out.println("Enter obtained credits");
		obtainedCredits = sc.nextInt();
	}
}

class Student{
	String name;
	int age;
	String gender;
	StudentSubject s[];
	
	public Student() {
		s = new StudentSubject[5];
		for(int i=0;i<s.length;i++) {
			s[i] = new StudentSubject();
		}
	}
	
	void studentdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter gender");
		gender = sc.next();
		
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter details of subject "+(i+1));
			s[i].input();
		}
	}
	
	public void getAvgCredits() {
		float total_tcredit=0;
		float total_ocredit=0;
		float avg_credit;
		
		for(StudentSubject sub: s) {
			total_tcredit += (float)sub.totalCredits;
			total_ocredit += (float)sub.obtainedCredits;
		}
		
		avg_credit = total_ocredit/total_tcredit;
		System.out.println("Avg credits : "+avg_credit);
		
	}
	
}
public class StudentSubMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.studentdata();
		s.getAvgCredits();
	}

}
