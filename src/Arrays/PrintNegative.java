package Arrays;
import java.util.Scanner;
public class PrintNegative {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements :");
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
    }
}
