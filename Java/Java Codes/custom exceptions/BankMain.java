package bank;

import java.util.Scanner;

class BalanceException extends Exception{
	public BalanceException(String msg) {
		super(msg);
	}
}
class BankAccount{
	int accno;
	double balance;
	
	BankAccount(){}

	public BankAccount(int accno, double balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}
	
	void withdraw() throws BalanceException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amt to withdraw : ");
		int withdraw = sc.nextInt();
		if(this.balance > withdraw) {
			this.balance = this.balance - withdraw;
		}
		else {
			throw new BalanceException("Balance less than withdraw amt");
		}
	}
	
	void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amt to deposit : ");
		int deposit = sc.nextInt();
		this.balance += deposit;
	}
	
}
public class BankMain {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount(1001,23000);
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("1. withdraw 2. deposit 3. show 4.exit");
			System.out.println("Enter choice");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				try {
				ba.withdraw();
				System.out.println("The Updated Balance is : "+ba.balance);
				}
				catch(BalanceException be) {
					System.out.println("Catched exception : "+be.getMessage());
				}
				break;
				
			case 2:
				ba.deposit();
				System.out.println("The Updated Balance is : "+ba.balance);
				break;
				
			case 3:
				System.out.println("Account number : "+ba.accno+" "+"Balance : "+ba.balance);
				break;
				
			case 4:
				System.out.println("Thank you for visiting");
				break;
			}
			
		}while(ch!=4);
	}

}
