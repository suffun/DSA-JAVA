package Arrays;
import java.util.Scanner;
public class ArraysBasics {
    public static void main(String[] args) {
        int[] arr = {1,9,4,5,6,7,8,8,3,3,3};
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }


    }

}

//public class ArraysBasics {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] suf = new int[7];
//        for (int i=0; i<7; i++){
//            suf[i] = sc.nextInt();
//        }
//        for(int i = 0; i<7; i++ ){
//            System.out.print(suf[i]+" ");
//        }
//
//
//    }
//
//}
//

//public class ArraysBasics {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] suf = new int[7];
//        for (int i=0; i<7; i++){
//            suf[i] = sc.nextInt();
//        }
//        for(int i = 0; i<7; i++ ){
//            System.out.print(suf[i]*2+" ");
//        }
//
//
//    }
//
//}

//given an array prints negative number only

//public class ArraysBasics {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter array size");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter array elements");
//        for (int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0; i<n; i++ ){
//            if(arr[i]<0)
//            System.out.print(arr[i]+" ");
//        }
//
//
//    }
//
//}
