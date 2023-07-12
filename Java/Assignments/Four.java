// 4. Write a program in Java to display the pattern like right angle triangle with a number.

public class Four {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=10;i++) {
            int a=1;
            for (j=1;j<=i;j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}