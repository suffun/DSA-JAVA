package Pattern_Printing;
import java.util.Scanner;
public class TriangleFlippedVertically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
           for(int j=1; j<=(n-i); j++){
               System.out.print("  ");
           }
           for(int j =1; j<=i; j++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter number of rows: ");
//    int n = sc.nextInt();
//
//    for (int i = 1; i <= n; i++) {
//        // 1. Loop for leading spaces
//        // In row 1, we need (n-1) spaces
//        for (int j = 1; j <= n - i; j++) {
//            System.out.print("  "); // Two spaces to match the "* " width
//        }
//
//        // 2. Loop for stars
//        // In row 1, we need 1 star
//        for (int j = 1; j <= i; j++) {
//            System.out.print("* ");
//        }
//
//        // Move to the next line
//        System.out.println();
//    }
//}
}
