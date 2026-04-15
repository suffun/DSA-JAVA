package MultiDimensionalArrays;

public class MinEleFromEachRow {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 5, 8},
                {3, 3, 4, 9},
                {2, 3, 5, 6},
                {4, 7, 7, 7}
        };

        int minOfMax = Integer.MAX_VALUE;
        int index = -1;

        // 2. Outer loop for rows
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }
            if (max < minOfMax) {
                minOfMax = max;
                index = i;
            }

        }
        System.out.println("Smallest among row maximums = " + minOfMax);
        System.out.println("Row index = " + index);


    }
}
