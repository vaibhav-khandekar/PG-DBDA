/*  8.Write a program to convert:
        a. byte value into String
        b. byte value into Byte instance.
        c. String instance into Byte instance.
 */

public class Eight {
    public static void main(String[] args) {
        // a. byte value into String
        byte b1 = 10;
        String s1 = String.valueOf(b1);
        System.out.println(s1);

        // b. byte value into Byte instance.
        byte b2 = 15;
        Byte s2 = b2;
        System.out.println(s2);

        // c. String instance into Byte instance.
        String s3 = "20";
        String s4 = new String(s3);
        Byte b3 = Byte.valueOf(s4);
        System.out.println(b3);
    }
}