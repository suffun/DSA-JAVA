package MultiDimensionalArrays;

public class ForEach {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 5, 8},
                {3, 3, 4, 9},
                {2, 3, 5, 6},
                {4, 7, 7, 7}
        };

        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }

//        for(int i = 0; i<arr.length; i++ ){
//            for(int ele : arr[i]){
//                System.out.print(ele+ " ");
//            }
//            System.out.println();
//        }

    }
}
