// 2. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
import java.util.*;;

// method 1
public class Two {
    public static void main(String[] args) {
        System.out.println("enter 5 elements = ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int sum = n1+n2+n3+n4+n5;
        System.out.println("sum of 5 numbers = "+sum);
        int avg = sum/5;
        System.out.println("average of 5 numbers = "+avg);
    }
}