public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        for (int i=5;i>0;i--) {
            for (int j=i-1;j>0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 1:");
        for (int i=5;i>0;i--) {
            for (int j=i-1;j>=0;j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 3:");
        for (int i=5;i>0;i--) {
            for (int j=i-1;j>=0;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}