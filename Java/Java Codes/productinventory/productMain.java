package product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class product implements Comparable<product>{
	int pid;
	String pname;
	int price;
	
	product(){}

	public product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public boolean equal(Object o)
	{
		if(o instanceof product) {
			product p = (product) o;
			return this.pid == p.pid && this.pname.equals(p.pname) && this.price==p.price;
		}
		return false;
	}
	
	public void addproduct(ArrayList<product> parr) {
		System.out.println("Enter pid ");
		pid = sc.nextInt();
		System.out.println("Enter product name");
		pname = sc.next();
		System.out.println("Enter price");
		price = sc.nextInt();
		
		product p1 = new product(pid,pname,price);
		
		if(parr.contains(p1)) {
			System.out.println("Product exist already");
		}
	
		int flag=0;
		
		for(product p : parr) {
			if(p.pid == pid) {
				flag =1;
				System.out.println("product id exists already");
			}
		}
		
		if(flag==0) {
			if(parr.contains(p1) == false) {
				if(parr.size()<5) {
					parr.add(p1);
					System.out.println("product added successfully");
				}
				else {
					System.out.println("5 elements already present");
				}
			}
		}
		
		
		
	}
	
	public void display(ArrayList<product> parr) {
		for(product p :parr) {
			System.out.println(p.pid+" "+p.pname+" "+p.price);
		}
	}
	
	public void removeproduct(ArrayList<product> parr)
	{
		System.out.println("enter pid");
		int prodid = sc.nextInt();
		System.out.println("enter pname");
		String prodname = sc.next();
		System.out.println("enter price");
		int prodprice = sc.nextInt();
		
		product prod = new product(prodid,prodname,prodprice);
		
		int flag=0;
		Iterator<product> itr = parr.iterator();
		while(itr.hasNext()) {
			
			product p3 = itr.next();
			if(p3.pid == prodid && p3.pname.equals(prodname) && p3.price == prodprice) {
				flag =1;
				itr.remove();
				System.out.println("product removed");
				break;
			}
		}
		if(flag==0) {
			System.out.println("product not found");
		}
	}
	
	public void sorted(ArrayList<product> parr) {
		Collections.sort(parr);
		System.out.println("PID\tProductName\tPrice");
		for(product p:parr)
		{
			System.out.println(p.pid+"  "+p.pname+"  "+p.price);
		}
	}

	@Override
	public int compareTo(product o) {
		if(this.pid>o.pid) {
			return 1;
		}
		else if(this.pid < o.pid) {
			return -1;
		}
		return 0;
	}
	
}
public class productMain
{
	public static void main(String[] args) {
		
		ArrayList<product> arr = new ArrayList<>();
		product p = new product();
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		do 
		{
			System.out.println("1.add 2.remove 3.display 4.sort 5.exit");
			System.out.println("enter choice");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				p.addproduct(arr);
				break;
				
			case 2:
				p.removeproduct(arr);
				break;
				
			case 3:
				p.display(arr);
				break;
				
			case 4:
				p.sorted(arr);
			}
		}while(ch!=5);
	}
}