package Pattern_Printing;
import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) { // Added public static
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // 1. Print the top full row of stars
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();

        // 2. Print the bridge structure
        int nsp = 1; // Initial spaces in the middle
        for (int i = 1; i <= n - 1; i++) {

            // Left Stars: Decreases as i increases
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + " ");
            }

            // Middle Spaces: Increases by 2 each row
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }

            // Right Stars: Decreases as i increases
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + " ");
            }

            nsp += 2; // Increment space count for next row
            System.out.println();
        }
    }
}