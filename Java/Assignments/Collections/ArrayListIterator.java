/*2. Write a Java program to iterate through all elements in an array list. using for each loop. 
 */
import java.util.ArrayList;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("White");
        al.add("Red");
        al.add("Yellow");
        al.add("Brown");
        al.add("Green");

        System.out.println("All elements in an array list for loop ");
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println("All elements using foreach loop ");
        al.forEach(a->{
            System.out.print(a+" ");
        });
    }
}
/*OUTPUT -->>
All elements in an array list for loop 
White Red Yellow Brown Green
All elements using foreach loop
White Red Yellow Brown Green 
 */