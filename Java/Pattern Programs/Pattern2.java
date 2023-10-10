public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        for (int i=0;i<5;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 2:");
        for (int i=0;i<5;i++) {
            for (int j=0;j<i+1;j++) {
                System.err.print(i);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 3:");
        for (int i=0;i<5;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}