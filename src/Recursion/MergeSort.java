package Recursion;

public class MergeSort {
   public static void main(String[] args) {
       int[] arr = {3,44, 5, 63, 5, 2, 34, 7, 8, 5};
       mergeSort(arr);
       for(int ele : arr){
           System.out.print(ele +" ");
       }
       
   }

    private static void mergeSort(int[] arr) {
       int n = arr.length;
       if(n==1) return;
//       step 1 : create 2 new empty array
       int[] a =new int[n/2];
       int[] b = new int[n-n/2];

//       step 2 : copy paste array in empty array
       int idx = 0;
       for(int i = 0; i<a.length; i++) a[i] = arr[idx++];
       for(int j = 0; j<b.length; j++) b[j] = arr[idx++];

//       step 3: magic

        mergeSort(a);
        mergeSort(b);
//merge a and b in arr

        merge(a,b,arr);

    }

    private static void merge(int[] a, int[] b, int[] c) {
       int i = 0, j =0, k = 0;
       while(i<a.length && j<b.length){
           if(a[i]<=b[j]) c[k++] = a[i++];
           else c[k++] = b[j++];
       }
       while(i<a.length) c[k++] = a[i++];
       while(j<b.length) c[k++] = b[j++];
    }

}
