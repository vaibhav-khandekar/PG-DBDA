package upcasting;

import java.util.Scanner;

class Employee
{
	String name;
	int id;
	int hourly_rate;
	
	Employee(){
		
	}

	public Employee(String name, int id, int hourly_rate) {
		super();
		this.name = name;
		this.id = id;
		this.hourly_rate = hourly_rate;
	}
	
	void print() {
		System.out.println("Name : "+this.name);
		System.out.println("Id : "+id);
		System.out.println("Hourly rate : "+this.hourly_rate);
	}
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter id : ");
		id = sc.nextInt();
		System.out.println("Enter hourly rate : ");
		hourly_rate = sc.nextInt();
	}
}

class FullTimeEmp extends Employee{
	int no_of_hours;

	public FullTimeEmp() {
		super();
	}

	public FullTimeEmp(String name, int id, int hourly_rate,int no_of_hours) {
		super(name, id, hourly_rate);
		this.no_of_hours = no_of_hours;
	}
	
	void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hours worked of fte");
		no_of_hours = sc.nextInt();
	}
	
	void print() {
		super.print();
		System.out.println("Salary of FTE : "+(hourly_rate*no_of_hours*30));
	}
	
}

class PartTimeEmp extends Employee{
	int no_of_hours;

	public PartTimeEmp() {
		super();
	}

	public PartTimeEmp(String name, int id, int hourly_rate,int no_of_hours) {
		super(name, id, hourly_rate);
		this.no_of_hours = no_of_hours;
	}
	
	void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hours worked of pte");
		no_of_hours = sc.nextInt();
	}
	
	void print() {
		super.print();
		System.out.println("Salary of PTE : "+(hourly_rate*no_of_hours*30));
	}
	
}

class Contractor extends Employee{
	int no_of_hours;

	public Contractor() {
		super();
	}

	public Contractor(String name, int id, int hourly_rate,int no_of_hours) {
		super(name, id, hourly_rate);
		this.no_of_hours = no_of_hours;
	}
	
	void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hours worked of contractor");
		no_of_hours = sc.nextInt();
	}
	
	void print() {
		super.print();
		System.out.println("Salary of Contractor : "+(hourly_rate*no_of_hours*30));
	}
	
}
public class EmployeeUpcastMain {

	public static void main(String[] args) {
		
		Employee e = new FullTimeEmp();
		e.accept();
		e.print();
		
		Employee e2 = new PartTimeEmp();
		e2.accept();
		e2.print();
		
		Employee e3 = new Contractor();
		e3.accept();
		e3.print();

	}

}
