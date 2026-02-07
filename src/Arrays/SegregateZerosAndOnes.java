package Arrays;

public class SegregateZerosAndOnes {
    public static void segregate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer until we find a 1
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move right pointer until we find a 0
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // Swap the 1 at left with the 0 at right
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        segregate(arr);

        // Print modified array
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
