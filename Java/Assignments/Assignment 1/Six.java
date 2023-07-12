/*
6.Write a program to perform below operations on Boolean type to convert:
    a. boolean value into String
    b. boolean value into Boolean instance
    c. String value into boolean value
    d. String value into Boolean instance
*/

public class Six {
    public static void main(String[] args) {
        // 1. boolean value into String
        boolean b1=true;
        string s=String.valueOf(b1);
        System.out.println(s);

        // 2. boolean value into Boolean instance
        boolean b2=false;
        Boolean b=Boolean.valueOf(b2);
        System.out.println(b);

        // 3. String value into boolean value
        String s1="true";
        boolean b3=Boolean.parseBoolean(s1);
        System.out.println(b3);

        // 4. String value into Boolean instance
        String s2="false";
        Boolean b4=Boolean.parseBoolean(s2);
        System.out.println(b4);
    }
}