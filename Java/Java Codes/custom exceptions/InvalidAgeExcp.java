package exceptions;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String msg){
		super(msg);
	}
}
class CustomExcp{
	
	public static void exceptioncust() throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		if(age > 18) {
			System.out.println("u can vote");
		}
		else {
			throw new InvalidAgeException("You are not eligible");
		}
	}
	public static void main(String[] args) {
		
		try {
		CustomExcp.exceptioncust();
		}
		catch(InvalidAgeException e) {
			System.out.println("catched exception : "+e.getMessage());
		}
		
	}
}
