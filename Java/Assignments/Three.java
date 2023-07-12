// 3. Write a program in Java to display the cube of the number upto given an integer.
import java.util.*;

// method 1
public class Three {
    public static void main(String[] args) {
        System.out.println("enter any integer = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int squre = n*n;
        System.out.println("square of "+n+" is "+squre);
        int cube = n*n*n;
        System.out.println("cube of "+n+" is "+cube);
    }
}