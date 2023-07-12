// 5. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.

public class Five {
    public static void main(String[] args) {
        int i,j,a=1;
        for (i=0;i<=3;i++) {
            for (j=0;j<=i;j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}