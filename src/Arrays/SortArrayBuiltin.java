package Arrays;
//import java.util.Scanner;
//public class SortArrayBuiltin {
//    public static void main(String[] args) {
//        int[] arr = {2,3,4,5,5,2,-1,-55,70};
//        print(arr);
//    }
//    public static void print(int[] arr) {
//        for(int i = 0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}


//import java.util.Arrays;
//public class SortArrayBuiltin {
//    public static void main(String[] args) {
//        int[] arr = {2,3,4,5,5,2,-1,-55,70};
//        print(arr);
//        Arrays.sort(arr);
//        print(arr);
//    }
//    public static void print(int[] arr) {
//        for(int i = 0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}


//homework : multiply odd indexed by 2 and 10 to even index element

import java.util.Scanner;
public class SortArrayBuiltin {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,2,-1,-55,70};
        print(arr);
    }
    public static void print(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]*2+"even");

            }
            else{
                System.out.println(arr[i]*10+"odd");
            }
        }
        System.out.println();
    }
}
