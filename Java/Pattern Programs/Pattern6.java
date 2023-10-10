public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<5;i++) {
            // for loop for spaces
            for (int s=n-i;s>1;s--) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}