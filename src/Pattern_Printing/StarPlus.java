package Pattern_Printing;

import java.util.Scanner;

//public class StarPlus {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println();
//        int n = sc.nextInt();
//        int mid = n/2 +1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//
//                if(i==mid || j == mid) System.out.print("* ");
//                else System.out.print("  ");
//
//            }
//            System.out.println();
//        }
//
//    }
//
//
//}


//print hollow rectangle

//public class StarPlus {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println();
//        int n = sc.nextInt();
//        int mid = n/2 +1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//
//                if(i==1|| i == n || j==1 || j==n) System.out.print("* ");
//                else System.out.print("  ");
//
//            }
//            System.out.println();
//        }
//
//    }
//
//
//}

//print star cross

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // size of the square pattern

        for (int i = 1; i <= n; i++) {          // rows
            for (int j = 1; j <= n; j++) {      // columns
                if (i == j || i + j == n + 1) { // main & anti-diagonal
                    System.out.print("* ");
                } else {
                    System.out.print("  ");     // spaces elsewhere
                }
            }
            System.out.println();
        }
    }
}


