/* 8. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three 
 * numbers are equal, "All numbers are different" if all three numbers are different and 
 * "Neither all are equal or different" otherwise.
*/

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Eight {
    public static void main(String[] args) {
        System.out.println("enter 3 integers = ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 == n2) {
            if (n2 == n3) {
                System.out.println("all numbers are equal");
            }
        }
        else if (n1 == n2) {
            if (n2 != n3) {
                System.out.println("neither all are equal or diffrent");
            }
        }
        else {
            System.out.println("neither all are equal or diffrent");
        }
    }
}
