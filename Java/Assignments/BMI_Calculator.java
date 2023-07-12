/* Body Mass Index Calculator

You have been asked to write a Java program to implement a BMI (Body Mass
Index) calculator. The program should have the following functionality:
The BMI calculator class should have the following fields:
a. height: A double field to store the height of the person in meters.
b. weight: A double field to store the weight of the person in kilograms.
The BMI calculator class should have the following methods:
a. A constructor to initialize the height and weight fields of the BMI calculator
object.
b. Void calculateBMI(): A method to calculate the BMI of the person using the
following formula:
BMI = weight / (height * height).

Write a Java program that creates an object of the BMI calculator class, sets the
height and weight fields of the BMI calculator object using the Reference Variable,
calculates the BMI using the calculateBMI() method, and prints the calculated BMI
to the console.
*/

import java.util.Scanner;

public class BMI_Calculator {
    float height, weight;
    BMI_Calculator(float h,float w) {
        this.height=h;
        this.weight=w;
    }

    void Calculate_BMI() {
        float result = weight / (height * height);
        System.out.println("Body Mass Index = "+result);
    }
    public static void main(String[] args) {
        System.out.print("enter height = ");
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        System.out.print("enter weight = ");
        float w = sc.nextFloat();
        BMI_Calculator bmi = new BMI_Calculator(h,w); // (h,w);
        bmi.Calculate_BMI();
    }
}