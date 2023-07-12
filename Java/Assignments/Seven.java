// 7.  Write a Java program that reads an integer and check whether it is negative, zero, or positive. 

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number = ");
        int n=sc.nextInt();
        if (n>0) {
            System.out.println(n+" is positive number");
        }
        else if (n<0) {
            System.out.println(n+" is negative integer");
        }
        else {
            System.out.println(n+" is zero");
        }
    }
}