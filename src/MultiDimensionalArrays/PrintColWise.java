package MultiDimensionalArrays;

public class PrintColWise {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5,6},{3,3,4,5},{2,3,5,5},{4,7,7,7}};
        for(int j = 0; j<arr[0].length; j++){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
