/*9. Write a Java program to reverse elements in an array list. 
 */

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Orange");
        al.add("Papaya");
        al.add("Banana");
        al.add("Gauva");
        al.add("Apple");
        al.add("Water Melon");

        System.out.println("Array list before reversing ");
        al.forEach(a->{
            System.out.print(a+" ");
        });

        System.out.println();
        System.out.println("After reversing the arrayList = ");
        for(int i = al.size() - 1;i>=0;i--)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}
/*
 * OUTPUT ==>>
 * Array list before reversing 
Orange Papaya Banana Gauva Apple Water Melon 
After reversing the arrayList =
Water Melon Apple Gauva Banana Papaya Orange
 */