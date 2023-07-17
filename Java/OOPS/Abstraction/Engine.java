import java.util.Scanner;
import java.util.ArrayList;

public class Engine {
    public static void Engine () {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount> ();
        Scanner Reader = new Scanner (System.in);
        BankAccount n = new BankAccount ();
        String response = Reader.nextLine ();
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println ("Welcome to The Bank of Money, what would you like to do?n enter code hereenter n to create a new account, enter e to use an existing account, or enter q to quit to main menu");
            response = Reader.nextLine ();
            if (response.equals ("q")) keepGoing = false;
            if (response.equals ("n")) accounts.add (new BankAccount ());
            if (response.equals ("e"))System.out.println ("what is your account number?");
        }
    }
}

class BankAccount {
    private double balance;
    private String name;
    private int acctNum;

    public BankAccount () {
        balance = 0;
        name = "";
        acctNum = 0;
    }

    public void deposit (double amount) {
        balance += amount;
    }

    public void withdraw (double amount) {
        balance -= amount;
    }

    public double getBalance () {
        return balance;
    }

    public String getName () {
        return name;
    }

    public int getAcctNum () {
        return acctNum;
    }
}