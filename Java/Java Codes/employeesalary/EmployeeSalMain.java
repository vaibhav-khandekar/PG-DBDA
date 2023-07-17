package employeesal;

import java.util.Scanner;

class Employee{
	
	String name;
	float basicSal;
	
	public Employee() {
		
	}

	public Employee(String name, float basicSal) {
		super();
		this.name = name;
		this.basicSal = basicSal;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("ENter basic sal : ");
		basicSal = sc.nextFloat();
	}
	
	public void print_name_sal() {
		System.out.println("Name of employee : "+this.name);
		System.out.println("Basic Salary of employee : "+this.basicSal);
	}
	
	public void getSal() {
		float hra;
		float da;
		float total;
		if(basicSal<1500) {
			hra = 0.1f *basicSal;
			da= 0.9f * basicSal;
			total = basicSal+hra+da;
			System.out.println("HRA is : "+hra);
			System.out.println("DA is : "+da);
			System.out.println("Total Salary is : "+total);
		}
		else {
			hra = 500;
			da= 0.98f * basicSal;
			total = basicSal+hra+da;
			System.out.println("HRA is : "+hra);
			System.out.println("DA is : "+da);
			System.out.println("Total Salary is : "+total);
		}
	}
}
public class EmployeeSalMain {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.accept();
		e.print_name_sal();
		e.getSal();

	}

}
