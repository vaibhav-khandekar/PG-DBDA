/*7. Write a Java program to search an element in a array list. 
 */

import java.util.ArrayList;
import java.util.Scanner;
public class SearchList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Orange");
        al.add("Papaya");
        al.add("Banana");
        al.add("Gauva");
        al.add("Apple");
        al.add("Water Melon");

        System.out.println("Elements in arrayList = ");
        al.forEach(a->{
            System.out.print(a+" ");
        });

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any index = ");
        int index = sc.nextInt();
        
        for(int i=0;i<=al.size();i++)
        {
            if(index == i)
            {
                System.out.println("Element present at index = "+i+" and Value = "+al.get(i));
            }
        }
        sc.close();
    }
}
/*
 * OUTPUT -->>
 * Elements in arrayList = 
Orange Papaya Banana Gauva Apple Water Melon 
Enter any index = 
2
Element present at index = 2 and Value = Banana
 */