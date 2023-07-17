// package inventoryselfnew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Computer implements Comparable<Computer>{
	String mname;
	int ram;
	int hdd;
	
	Computer(){
		
	}

	public Computer(String mname, int ram, int hdd) {
		super();
		this.mname = mname;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public boolean equals(Object o) 
	{
		if(o instanceof Computer)
		{
			Computer c = (Computer) o;
			return this.mname.equals(c.mname) && this.ram == c.ram && 
					this.hdd==c.hdd;
		}
		return false;
	}
	
	public void addComputer(ArrayList<Computer> arr) 
	{
		System.out.println("Enter manufacturer");
		mname = sc.next();
		System.out.println("Enter ram ");
		ram = sc.nextInt();
		System.out.println("Enter hdd");
		hdd = sc.nextInt();
		
		Computer c1 = new Computer(mname,ram,hdd);
		
		if(arr.contains(c1)) 
		{
			System.out.println("Computer already exists");
		}
		else
		{
			arr.add(c1);
			System.out.println("Computer added successfully");
		}
			
	}
	
	void removeComputer(ArrayList<Computer> arr) 
	{
		System.out.println("Enter manufacturer");
		mname = sc.next();
		System.out.println("Enter ram ");
		ram = sc.nextInt();
		System.out.println("Enter hdd");
		hdd = sc.nextInt();
		
		Computer c1 = new Computer(mname,ram,hdd);
		
		if(arr.remove(c1)) 
		{
			System.out.println("Computer removed ");
		}
		else
		{
			System.out.println("Computer does not exist");
		}
	}

	@Override
	public int compareTo(Computer o) {
		
		return this.mname.compareTo(o.mname);
	}
	
	public void display(ArrayList<Computer> arr) 
	{
		Collections.sort(arr);
		for(Computer c : arr)
		{
			System.out.println(c.mname+" "+c.ram+" "+c.hdd);
		}
	}
}
public class CompInventory {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<Computer> arr = new ArrayList<>();
		Computer ci = new Computer();
		int ch;
		
		do 
		{
			System.out.println("1.add 2.remove 3.sort 4.exit");
			System.out.println("Enter choice ");
			ch = sc.nextInt();
			
			switch(ch) 
			{
			case 1:
				ci.addComputer(arr);
				break;
				
			case 2:
				ci.removeComputer(arr);
				break;
				
			case 3:
				ci.display(arr);
				break;
				
			case 4:
				System.out.println("exit");
				break;
			}
		}while(ch!=4);
	}

}
