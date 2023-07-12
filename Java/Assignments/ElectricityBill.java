/* Electricity Bill Calculation

Create a class named "ElectricityBill" that has the following instance variables:
a. customerName (String)
b. unitsConsumed (double)
c. billAmount (double)

Define a method named "calculateBillAmount" that calculates the bill amount based
on the number of units consumed. The formula for calculating the bill amount is:
a. For the first 100 units: Rs. 5 per unit
b. For the next 200 units: Rs. 7 per unit
c. For the remaining units: Rs. 10 per unit

This method should print billAmount for the particular instance.
Create an instance of the class and assigned it to reference variable of the class.

Define a main method that creates an object of the "ElectricityBill" class and sets the
customerName and unitsConsumed instance variables. Then, call the
"calculateBillAmount" method to calculate the bill amount and display the
customerName, unitsConsumed, and billAmount.
*/
import java.util.*;

public class ElectricityBill {
    String CustomerName;
    Double unitsConsumed;
    Double billAmount=0.0;
    
    void calculateBillAmount(Double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
        if (this.unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        }
        else if (this.unitsConsumed <= 300) {
            billAmount = (100*5) + ((this.unitsConsumed - 100)*7);
        }
        else {
            billAmount = (100*5) + (200*7) + ((unitsConsumed - 300)*10);
        }
        System.out.println("bill amount = "+billAmount);
    }

    void getData(String name,Double units) {
        this.CustomerName = name;
        this.unitsConsumed = units;
    }

    void printData() {
        System.out.println("Customer Name = "+this.CustomerName);
        System.out.println("Units Consumed = "+this.unitsConsumed);
    }
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name of the customer = ");
        String name = sc.nextLine();
        System.out.print("enter units which are consumed by customer = ");
        double units = sc.nextDouble();
        eb.getData(name,units);
        eb.printData();
        eb.calculateBillAmount(units);
    }
}