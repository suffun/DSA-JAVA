package Pattern_Printing;

import java.util.Scanner;

public class Diamond {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            // 1. Loop for leading spaces (increases)
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            // 2. Loop for stars increase

            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("* ");
                a+=2;
            }

            // Move to the next line
            System.out.println();
        }
    }
}
