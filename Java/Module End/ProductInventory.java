package com.cdac.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Product implements Comparable<Product>{
	String productName;
	int quantity;
	
	Product(){
	}

	public Product(String productName, int quantity) {
		super();
		this.productName = productName;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class ProductInventory {
	
	public static void main(String[] args) {
		
		
		ArrayList<Product> arc = new ArrayList<Product>();
		
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		do {
            System.out.println("1. add product to inventory");
            System.out.println("2. remove product from inventory");
            System.out.println("3. display inventory");
            System.out.println("4. exit");
            System.out.print("enter your choice = ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				if(ch==1) {
					System.out.print("enter product name = ");
                    String productName = sc.next();
                    System.out.print("enter quantity of product = ");
                    int quantity = sc.nextInt();
                    Product product = new Product(productName, quantity);
					
					arc.add(new Product(productName,quantity));
					
					int i = 0;
					for(Product p : arc) {
						System.out.println("index : "+i+" |"+p.productName+" "+p.quantity);
						i++;
					}
				}
				break;
				
			case 2:
				if(ch==2) {
					
					System.out.println("enter index to remove product = ");
					int index = sc.nextInt();
					arc.remove(index);
					
					System.out.println("after removing product list =  ");
					for(Product p : arc) {
						System.out.println(p.productName+" "+p.quantity);
					}
				}
				break;
				
			case 3:
				if(ch==3) {
					Collections.sort(arc);
					System.out.println("After sorting with respect to product list ");
					for(Product p : arc) {
						System.out.println(p.productName+" "+p.quantity);
					}
				}
				break;
				
			case 4:
				System.out.println("exiting");
				break;
				
			default:
                System.out.println("invalid choice inserted");
                break;
			}
			
		}while(ch!=4);
		
	 }
}