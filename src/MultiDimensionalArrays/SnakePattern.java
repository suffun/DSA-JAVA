package MultiDimensionalArrays;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5,6},{3,3,4,5},{2,3,5,5},{4,7,7,7}};
        for(int i = 0; i<arr.length; i++){
            if(i%2 == 0){
                for(int j = 0; j<arr[0].length; j++){
                    System.out.print(arr[i][j] +" ");
                }

            }
            else{
                for(int j = arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j] +" ");
                }
            }

            System.out.println();
        }

    }
}
