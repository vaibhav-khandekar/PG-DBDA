package employee_abstractmethod;

import java.util.Scanner;

abstract class Emp{
	int empno;
	String ename;
	
	public Emp(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	Emp(){
		
	}
	
	abstract double getsal();
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp number : ");
		empno = sc.nextInt();
		System.out.println("Enter employee name : ");
		ename = sc.next();
	}
	
	
	public void show() {
		System.out.println("Emp id : "+this.empno+" "+"EmpName : "+this.ename);
	}
}

class PermanentEmployee extends Emp{

	double basicsal;
	
	public PermanentEmployee(int empno, String ename,double basicsal) {
		super(empno, ename);
		this.basicsal = basicsal;
	}
	PermanentEmployee(){
	}
	
	@Override
	public double getsal() {
		
		
		if (basicsal <= 30000) {
            return basicsal * 1.6;
        } else {
            double grossSal = 30000 * 1.6;
            grossSal += (basicsal - 30000) * 1.8;
            return grossSal;
        }
	}

	
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		Emp e = new PermanentEmployee();
		e.accept();
		e.show();
		System.out.println("Gross salary is : "+e.getsal());
		
		Emp e2 = new PermanentEmployee(112,"pia",23000);
		e2.show();
		System.out.println("Gross salary is : "+e2.getsal());
		
		}
	}

