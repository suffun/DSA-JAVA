package Arrays;
import java.util.Scanner;

//public class Sum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter array size:");
//        int n = sc.nextInt();  // input array size
//
//        System.out.println("Enter array elements:");
//        int[] arr = new int[n];  // create array
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();  // input array elements
//        }
//
//        int sum = 0;  // initialize sum
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];  // add each element to sum
//        }
//
//        System.out.println(sum);
//
//    }
//}

//public class Sum {
//    public static void main(String[] args) {
//        int[] arr = {1, 9, 4, 5, 6, 7, 8, 8, 3, 3, 3};
//        int n = arr.length;
//        int sum = 0;  // initialize sum
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];  // add each element to sum
//        }
//
//        System.out.println(sum);
//
//
//    }
//}

//product of all array
//public class Sum {
//    public static void main(String[] args) {
//        int[] arr = {1, 9, 4, 5, 6, 7, 8, 8, 3, 3, 3};
//        int n = arr.length;
//        int product = 1;  // initialize sum
//        for (int i = 0; i < n; i++) {
//            product *= arr[i];  // add each element to sum
//        }
//
//        System.out.println(product);
//
//
//    }
//}


public class Sum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements :");
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<=n-1; i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
