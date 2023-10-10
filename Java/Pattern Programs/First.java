public class First {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row = 4;
        int col = 4;
        System.out.println("Original array is --> ");
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Output array is -->");
        for (int i=0;i<row;i++) {
            if (i%2==0) {
                for (int j=0;j<col;j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for (int j=col-1;j>=0;j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}