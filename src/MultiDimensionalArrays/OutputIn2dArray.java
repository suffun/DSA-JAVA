package MultiDimensionalArrays;

public class OutputIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5,6},{3,3,4,5},{2,3,5,5},{4,7,7,7}};
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
