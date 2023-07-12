/*6. Write a Java program to remove the third element from an array list. 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(43);
        al.add(76);
        al.add(54);
        al.add(23);
        al.add(33);

        System.out.println("Before removing Array List Elements are = ");
        al.forEach(a->{
            System.out.print(a+" ");
        });

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index to remove element in arraylist - ");
        int index = sc.nextInt();
      

        for(int i=0;i<=al.size();i++)
        {
            if(i == index)
            {
                System.out.print(al.remove(index));
            }
        }

        System.out.println("After removing the arrayList ");
        al.forEach(a->{
            System.out.print(a+" ");
        });
        sc.close();
    }
}
/*
 * OUTPUT -->>
 * Before removing Array List Elements are = 
12 43 76 54 23 33 
Enter index to remove element in arraylist - 
3
54After removing the arrayList
12 43 76 23 33
--------------------------------------------
Before removing Array List Elements are = 
12 43 76 54 23 33 
Enter index to remove element in arraylist - 
0
12After removing the arrayList
43 76 54 23 33
 */