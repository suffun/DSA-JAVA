package Arrays;

public class Search {
    public static void main(String[] args) { // Fixed: Added 'public static'
        int[] arr = {2, 4, 4, 5, 77, 8, 89, 89, 9, 96, 65, 55, 5};
        int target = 8;
        boolean found = false; // The flag

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Yo! We found your number " + target + " at index " + i);
                found = true;
                break; // Stop searching once found
            }
        }

        if (!found) {
            System.out.println("Sorry, we did not find the number " + target);
        }
    }
}