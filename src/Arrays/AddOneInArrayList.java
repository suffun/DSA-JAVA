package Arrays;
import java.util.Vector;
import java.util.Collections;
public class AddOneInArrayList {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1; // We start by adding 1

        // Traverse the array from last digit to first
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;

            if (sum <= 9) {
                // If sum is single-digit, store it and reset carry
                ans.add(sum);
                carry = 0;
            } else {
                // If sum >= 10, store 0 and carry over 1
                ans.add(0);
                carry = 1;
            }
        }

        // If carry is still 1 after processing all digits, add it
        if (carry == 1) {
            ans.add(1);
        }

        // Reverse the vector to get the correct order (most significant digit first)
        Collections.reverse(ans);

        return ans;
    }

}
