package Arrays;
//Multiply odd index by 2 and 10 to even index element
import java.util.Scanner;
public class Practice {
    static void main(String[] args) {
        int[] arr = {2,2,4,5,7,4,6,9};
        for(int i=0; i<arr.length; i++){
            if(i%2==0) System.out.println(arr[i]*2);
            else System.out.println(arr[i]*10);
        }
    }
}
