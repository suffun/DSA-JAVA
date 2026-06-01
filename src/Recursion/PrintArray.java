package Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {3,5,3,45,3,5,3,4,43,4};
        Print(arr,0);
    }
    public static void Print(int[] arr, int idx) {
        int n = arr.length;
        if(idx == n) return;
        System.out.print(" "+arr[idx]);
        Print(arr,idx+1);

    }
}
