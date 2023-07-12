/*
Telephone Bill Calculation
You are required to write a Java program to calculate the telephone bill for a given
customer based on their usage. The program should take the following inputs from
the user:
a. Customer name
b. Phone number
c. Number of calls made
d. Duration of calls (in minutes)

The program should then calculate the bill for the customerbased on the following
criteria:
a. The first 100 calls are charged at a rate of 50 cents per call.
b. Calls beyond the first 100 are charged at a rate of 25 cents per call.
c. All calls are subject to a minimum duration of 1 minute.
d. Calls with a duration less than 1 minute are rounded up to 1 minute.
e. There is a flat rate of $10 per month for all customers.
*/
import java.util.*;

public class TelephoneBill {
    String CustomerName;
    long PhoneNumber;
    int numberofcalls;
    float duration;
    
    void getData(String name,long contact,int count,float duration) {
        this.CustomerName = name;
        this.PhoneNumber = contact;
        this.numberofcalls = count;
        this.duration = duration;
    }

    void printData() {
        System.out.println("customer name = "+this.CustomerName);
        System.out.println("phone number = "+this.PhoneNumber);
        System.out.println("number of calls = "+this.numberofcalls);
        System.out.println("duration of calls = "+this.duration);
    }
    public static void main(String[] args) {
        String name;
        long contact;
        int count;
        float duration;
        TelephoneBill tb = new TelephoneBill();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name of the customer = ");
        String name = sc.nextLine();
        System.out.print("enter contact details of the customer = ");
        long contact = sc.nextLong();
        System.out.print("enter number of calls = ");
        int count = sc.nextInt();
        System.out.print("enter duration of call = ");
        float duration = sc.nextFloat();
        tb.getData(null, 0, 0, 0);
    }
}