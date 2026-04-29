//package MultiDimensionalArrays;
//
//public class Addition {
//    public static void main(String[] args) {
//        int[][] arr = {{3,4,5,6},{3,3,4,5},{2,3,5,5},{4,7,7,7}};
//        int sum = 0;
//        for(int i = 0; i<arr.length; i++){
//            for(int j = 0; j<arr[0].length; j++){
//                sum+= arr[i][j];
//            }
//
//        }
//        System.out.println(sum);
//    }
//}

package MultiDimensionalArrays;

public class Addition {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5,6},{3,3,4,5},{2,3,5,5},{4,7,7,7}};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                sum+= arr[i][j];
            }

            System.out.println(sum);

        }

    }
}
