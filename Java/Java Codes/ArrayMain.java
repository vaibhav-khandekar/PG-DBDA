package arraylistassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		
		ArrayList<String> arstr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		arstr.add("Orange");
		arstr.add("Blue");
		arstr.add("Cyan");
		arstr.add("Black");
		arstr.add("Pink");
		arstr.add("Purple");
		arstr.add("Green");
		arstr.add("Yellow");
		
		// print the arraylist using syso
		System.out.println("ArrayList --> ");
		System.out.println(arstr);
		
		System.out.println();
		
		System.out.println("Using for each loop");
		for(String s:arstr) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// Write a Java program to insert an element into the array list at the first position. 
		System.out.println("Insert an element at first position , Enter ele : ");
		String ele = sc.next();
		// arstr.add(index , ele_insert);
		arstr.add(0, ele);
		System.out.println(arstr);
		
		// Write a Java program to retrieve an element (at a specified index) from a given array list. 
		System.out.println();
		System.out.println("Enter index for which you want element : ");
		int i = sc.nextInt();
		System.out.println("Element at index "+i+" is : "+arstr.get(i));
		
		//Write a Java program to update an array element by the given element. 
		System.out.println();
		System.out.println("Enter ele index you want to update : ");
		int li = sc.nextInt();
		System.out.println("Enter element to update with : ");
		String elem = sc.next();
		arstr.set(li,elem);
		System.out.println("updated list : ");
		System.out.println(arstr);
		
		
		
		// Write a Java program to remove the third element from an array list.
		System.out.println();
		System.out.println("List after removing third element from list : ");
		arstr.remove(3);
		System.out.println(arstr);
		
		System.out.println();
		// search an element in a array list
		System.out.println("Enter element you want to search ");
		String sele = sc.next() ;
		if(arstr.contains(sele)) {
			System.out.println("Element present at position : "+arstr.indexOf(sele));
		}
		else {
			System.out.println("Element not present");
		}
		
		
		System.out.println();
		ArrayList<String> a2 = new ArrayList<>();
		a2.addAll(arstr);
		System.out.println("After copying to arraylist 2 ");
		System.out.println(a2);
		
		Collections.reverse(a2);
		System.out.println("After reversing :");
		System.out.println(a2);
		
		System.out.println("Extracting first 3 elements of arraylist");
		System.out.println(arstr.subList(0, 3));
	}

}
