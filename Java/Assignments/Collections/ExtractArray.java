/*10. Write a Java program to extract a portion of an array list. 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ExtractArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Orange");
        al.add("Papaya");
        al.add("Banana");
        al.add("Gauva");
        al.add("Apple");
        al.add("Water Melon");

        System.out.println("Full ArrayList = ");
        al.forEach(a->{
            System.out.print(a+" ");
        });

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start index = ");
        int start = sc.nextInt();
        System.out.println("Enter last index = ");
        int last = sc.nextInt();

        System.out.println();
        System.out.println("ArrayList after sublist = ");
        System.out.println(al.subList(start,last));
        sc.close();
    }
}
/*OUTPUT -->>
 * Full ArrayList = 
Orange Papaya Banana Gauva Apple Water Melon 
Enter start index = 
0
Enter last index =
4

ArrayList after sublist =
[Orange, Papaya, Banana, Gauva]
 */