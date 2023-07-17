package arraylistassignment;

import java.util.ArrayList;
import java.util.*;

//Write a program that reads in a list of integers from users 
//and then displays the sum, average, minimum, 
//and maximum values in the list. (Using ArrayList)

public class ArrayOpr {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of values");
		int n = sc.nextInt();
		
		System.out.println("Enter the values");
		for(int i =0;i<n;i++) {
		
			int a= sc.nextInt();
			arr.add(a);
		}
		
		int max = arr.get(0);
		int min = arr.get(0);
		
		int sum =0;
		for(Integer i : arr) {
			if(i>max) {
				max=i;
			}
			
			if(i<min) {
				min=i;
			}
			
			sum = sum + i;
		}
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		System.out.println("sum : "+sum);

		float avg ;
		avg = (float)sum / n;
		System.out.println("avg : "+avg);
	}
}
