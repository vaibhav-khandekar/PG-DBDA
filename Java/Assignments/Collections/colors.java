/*
 * 1. Write a Java program to create an array list, add some colors (strings) and print out the collection. 

 */
import java.util.ArrayList;

class colors
{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("White");
        al.add("Red");
        al.add("Yellow");
        al.add("Brown");
        al.add("Green");
        
        System.out.println("Colors added in Arraylist");
        for(String s : al)
        {
            System.out.println(s);
        }
    }
}
/*
 * OUTPUT -->>
 * Colors added in Arraylist
White
Red
Yellow
Brown
Green
 */