public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        int a = 1;
        for (int i=0;i<5;i++) {
            for (int j=0;j<5;j++) {
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 2:");
        int b = 1;
        for (int i=0;i<5;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print(b++ +" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 3:");
        int c = 1;
        for (int i=5;i>0;i--) {
            for (int j=i-1;j>0;j--) {
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
}