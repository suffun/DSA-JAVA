package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {0, 2, 5, 6, 9};
        int[] b = {1, 3, 4, 5, 7, 8,};

        int[] c = new int[a.length + b.length];

        merge(c, a, b);

        for (int ele : c) System.out.print(ele + " ");
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        // Merge until one array is exhausted
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements of a[]
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Copy remaining elements of b[]
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
