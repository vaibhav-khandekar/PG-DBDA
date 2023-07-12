/*3. Write a Java program to insert an element into the array list at the first position. 
 */

import java.util.ArrayList;

public class InsertFirst {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(34);
        al.add(87);
        al.add(98);
        al.add(345);

        System.out.println("Displaying elements from ArrayList");
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println("Insert at first position ");
        al.add(0,234);
        System.out.println("Displaying arraylist elements after inserting element at first position");
        for(int i : al)
        {
            System.out.print(i+" ");
        }
    }
}
/*OUTPUT -->>
 * Displaying elements from ArrayList
12 34 87 98 345
Insert at first position
Displaying arraylist elements after inserting element at first position
234 12 34 87 98 345
 */