import java.util.Scanner;

class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class CustomException {

    public static void Exception() throws AgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age = ");
        int age = sc.nextInt();
        if(age > 18) {
            System.out.println("you are eligible for voting");
        }
        else {
            throw new AgeException("you are not eligible yet");
        }
    }
    public static void main(String[] args) {
        try {
            CustomException.Exception();
        }
        catch(AgeException e) {
            System.out.println("exception catched - "+e.getMessage());
        }
        finally {
            System.out.println("execution successfully completed");
        }
    }
}