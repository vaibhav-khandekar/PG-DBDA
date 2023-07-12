// 1. Take three numbers from the user and print the greatest number.
import java.util.Scanner;

// method 1
public class One {
    public static void main(String[] args) {
        System.out.println("enter any 3 integers = ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1>n2)
        {
            if (n1>n3)
            {
                System.out.println(n1+" is a greatest number");
            }
            else
            {
                System.out.println(n3+" is a greatest number");
            }
        }
        else if (n2>n3)
        {
            System.out.println(n2+" is a greatest number");
        }
        else
        {
            System.out.println(n3+" is a greatest number");
        }
    }
}