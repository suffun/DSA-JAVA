package MultiDimensionalArrays;

public class ReverseRowsAndCols {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5,6},{3,3,4,5},{2,3,5,5},{4,7,7,7}};
        for(int i = arr.length-1; i>=0; i--){
            for(int j = arr[i].length-1; j>=0; j--){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
