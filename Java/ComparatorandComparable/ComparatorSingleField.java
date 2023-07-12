package comparatorandComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// comparator
// used to solve object based on multiple attributes in a single code
// it has the compare(objname o1 , objectname o2) method to sort
// Collections.sort(listname,Comparatorname)

class Employee {
	int EmpId;
	String EmpName;
	
	public Employee(int empid,String empname)
	{
		EmpId =empid;
		EmpName = empname;
		
	}
}
class CompareEmpID implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.EmpId > o2.EmpId) {
			return 1;
		}
		else if (o1.EmpId < o2.EmpId) {
			return -1;
		}
		return 0;
	}
}

class CompareName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.EmpName.compareTo(o2.EmpName);
	}
	
}

public class ComparatorSingleField
{
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"TIA");
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(new Employee(103,"Sia"));
		emplist.add(new Employee(102,"Pia"));
		emplist.add(new Employee(104,"Aysha"));
		
		System.out.println("Before sorting");
		for (Employee s: emplist)
		{
			System.out.println(s.EmpId+" "+s.EmpName);
		}
		
		CompareEmpID com1 = new CompareEmpID();
		
		//emplist.sort(com1);
		
		Collections.sort(emplist, com1);
		
		System.out.println("After Sorting by empid");
		for(Employee s: emplist)
		{
			System.out.println(s.EmpId+" "+s.EmpName);
		}	
		
		CompareName cn = new CompareName();
		Collections.sort(emplist,cn);
		System.out.println("After sorting by name");
		for(Employee s: emplist)
		{
			System.out.println(s.EmpId+" "+s.EmpName);
		}
	}	
}
