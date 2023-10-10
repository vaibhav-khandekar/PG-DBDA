public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        for (int i=5;i>0;i--) {

            // loop to print spaces
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for (int j=i-1;j>=0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}