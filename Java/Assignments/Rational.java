/*
 * You are required to write a Java program to perform arithmetic operations on rational
numbers. Rational numbers are numbers that can be expressed as a fraction of two
integers (i.e., numerator and denominator). The program should take the following
inputs from the user:

Two rational numbers (i.e., two pairs of integers representing the numerator and
denominator of each number)
The program should then perform the arithmetic operation on the two rational
numbers and output the result in the form of a reduced fraction (i.e., the numerator
and denominator should be as small as possible).
 */

import java.util.Scanner;

public class Rational {
    double a;
    double b;
    
    Rational(double a,double b) {
        this.a=a;
        this.b=b;
    }

    void Calculation() {
        double sum = a+b;
        System.out.println(sum);
        double sub = a-b;
        System.out.println(sub);
        double mul = a*b;
        System.out.println(mul);
        double div = a/b;
        System.out.println(div);
        double mod = a%b;
        System.out.println(mod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1 = ");
        double n1=sc.nextInt();
        System.out.println("enter d1 = ");
        double d1=sc.nextInt();
        System.out.println("enter n2 = ");
        double n2=sc.nextInt();
        System.out.println("enter d2 = ");
        double d2=sc.nextInt();
        double a=n1/d1;
        double b=n2/d2;
        Rational r = new Rational(a,b);
        r.Calculation();
    }
}