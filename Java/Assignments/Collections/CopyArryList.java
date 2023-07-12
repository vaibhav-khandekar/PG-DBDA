/*8. Write a Java program to copy one array list into another. 
 */

import java.util.ArrayList;

public class CopyArryList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Orange");
        al.add("Papaya");
        al.add("Banana");
        al.add("Gauva");
        al.add("Apple");
        al.add("Water Melon"); 
        System.out.println("Array list 1 elements = ");
        al.forEach(aa->{
            System.out.print(aa+" ");
        });

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("SweetLime");
        a2.add("Grapes");
        a2.addAll(al);

        System.out.println();
        System.out.println("Array list 2 elements after copying ArrayList 1 = ");
        a2.forEach(a->{
            System.out.print(a+" ");
        });
    }
}
/*OUTPUT -->>
 * Array list 1 elements = 
Orange Papaya Banana Gauva Apple Water Melon 
Array list 2 elements after copying ArrayList 1 =
SweetLime Grapes Orange Papaya Banana Gauva Apple Water Melon
 */