package Arrays;

//public class ShallowCopyDeepCopy {
//    public static void main(String[] args) {
//        int [] arr = {2,4,5,6,6,6};
//        int [] x = arr;  //shallow copy of array
//        x[1] = 100;
//        System.out.println(arr[1]);
//    }
//}


//deep copy

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,6,6};
        int [] deep = Arrays.copyOf(arr,arr.length);  //deep copy of array will not change when change in original array
        deep[1] = 100;
        System.out.println(arr[1]);
    }
}
