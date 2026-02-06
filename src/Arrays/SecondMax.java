//package Arrays;
//
//public class SecondMax {
//    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,7,9,40,9,40};
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        int smax = Integer.MIN_VALUE;
//        for(int i = 0; i<n; i++){
//            if(arr[i]>max) max = arr[i];
//        }
//        //Calculate second max
//        for(int i = 0; i<n; i++){
//            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
//        }
//        System.out.println(max);
//        System.out.println(smax);
//    }
//}
package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,70,9,40,9,40};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]>max) max = arr[i];
        }
//        Calculate second max
        for(int i = 0; i<n; i++){
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);

    }
}
