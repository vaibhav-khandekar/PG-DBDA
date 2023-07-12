/*5. Write a Java program to update an array element by the given element. 
 */

import java.util.ArrayList;
import java.util.Scanner;
public class UpdateAL {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(43);
        al.add(76);
        al.add(54);
        al.add(23);
        al.add(33);

        System.out.println("Before updating Array List Elements are = ");
        al.forEach(a->{
            System.out.print(a+" ");
        });

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index to update element in arraylist - ");
        int index = sc.nextInt();
        System.out.println("Enter the value of element to be updates");
        int val = sc.nextInt();

        for(int i=0;i<=al.size();i++)
        {
            if(i == index)
            {
                System.out.print(al.set(index,val));
            }
        }

        System.out.println("After updating the arrayList ");
        al.forEach(a->{
            System.out.print(a+" ");
        });
        sc.close();
    }
}
/*
 * OUTPUT --->>
 * Before updating Array List Elements are = 
12 43 76 54 23 33 
Enter index to update element in arraylist - 
2
Enter the value of element to be updates
33
76After updating the arrayList
12 43 33 54 23 33
-------------------------------------------------
Before updating Array List Elements are = 
12 43 76 54 23 33 
Enter index to update element in arraylist - 
0
Enter the value of element to be updates
11111111
12After updating the arrayList
11111111 43 76 54 23 33
 */