public class Array1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Original array -->");
        int row=4, col=4;
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Output Array --> ");
        for(int i=0;i<row;i++) {
            if(i%2==0) {
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

// Logic -->
/*

 for(int i=0;i<row;i++){
    if(i%2==0){
        for(int j=0;j<col;j++){
            print(arr[i][j]," ")
        }
    }
    else {
        for(j=col-1;j>=0;j--){
            print(arr[i][j]+" ")
        }
    }
 }
 */