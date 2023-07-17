import java.util.Scanner;

import javafx.beans.binding.StringExpression;

class StringException extends Exception {
    StringException(String msg) {
        super(msg);
    }
}
public class CustomException2 {
    public static void Exception2() throws StringException{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string = ");
        String str = sc.nextLine();
        try {
            if(str.length() < 5) {
                System.out.println("string valid");
            }
            else {
                throw new StringException("string is too long");
            }
        }
        catch(StringException e) {
            System.out.println("exception catched = "+e.getMessage());
        }
        finally {
            System.out.println("finally completed");
        }

    }
    public static void main(String[] args) throws StringException {
        CustomException2.Exception2();
    }
}