//package MultiDimensionalArrays;
//
//public class FindMaxElement {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {3, 4, 5, 6},
//                {3, 3, 4, 5},
//                {2, 3, 5, 5},
//                {4, 7, 7, 7}
//        };
//
//        // 1. Initialize max with the first element of the array
//        int max = arr[0][0];
//
//        // 2. Outer loop for rows
//        for (int i = 0; i < arr.length; i++) {
//            // 3. Inner loop for columns
//            for (int j = 0; j < arr[i].length; j++) {
//                // 4. If current element is bigger than our max, update max
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//        }
//
//        System.out.println("The maximum element is: " + max);
//    }
//}

package MultiDimensionalArrays;

public class FindMaxElement {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 5, 6},
                {3, 3, 4, 5},
                {2, 3, 5, 50},
                {4, 7, 7, 7}
        };

        // 1. Initialize max with the first element of the array
        int max = arr[0][0];

        // 2. Outer loop for rows
        for (int i = 0; i < arr.length; i++) {
            // 3. Inner loop for columns
            for (int j = 0; j < arr[i].length; j++) {
                // 4. If current element is bigger than our max, update max
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }


        }
        System.out.println("The maximum element is: " + max);


    }

}
