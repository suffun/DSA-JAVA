package Arrays;

public class ProductOfArray {
    static void main(String[] args) {
        int[] arr = {23,4,3,5,7,5,7,5,6};
        int a =1;
        for(int i=0; i<arr.length; i++){
            a*=arr[i];
        }
        System.out.println(a);
    }
}
