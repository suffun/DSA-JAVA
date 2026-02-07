package Arrays;
import java.util.Scanner;
//public class LinearSearch {
//    public static void main(String[] args) {
//        int [] arr = {34,54,66,86,33,55};
//        int found = 66;
//        boolean flag = true;
//        for(int i = 0; i<arr.length; i++ ){
//            if(arr[i]==found){
//                flag = true;
//                break;
//            }
//        }
//        if(flag) System.out.println("target exist in array");
//        else System.out.println("target does  not exist");
//
//    }
//}

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {34,54,66,86,33,55};
        int target = 66;
        int found  = -1;
        for(int i = 0; i<arr.length; i++ ){
            if(arr[i]==target){
                found = i;
                break;
            }
        }
        if(found != -1) System.out.println("target exist in array");
        else System.out.println("target does  not exist");

    }
}
