/* 13. Write a program to convert:
        a. short value into String
        b. short value into Short instance.
        c. String instance into Short instance. 
*/

public class Thirteen {
    // a. short value into String
    short a1 = 12;
    String s = String.valueOf(a1);
    System.out.println(s);

    // b. short value into Short instance.
    Short a2 = a1;
    System.out.println(a2);

    // c. String instance into Short instance.
    String s1 = "20";
    String s2 = new String(s1);
    Short a3 = new Short(s2);
    System.out.println(a3);
}