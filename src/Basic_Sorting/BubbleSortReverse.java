package Basic_Sorting;

public class BubbleSortReverse {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;

        System.out.println("Original Array:");
        print(arr);

        // Reverse Bubble Sort (Descending Order)
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;   // reset every pass

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("Sorted Array (in Descending):");
        print(arr);
    }
}
