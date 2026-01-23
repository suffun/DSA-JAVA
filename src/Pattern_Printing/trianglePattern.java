package Pattern_Printing;
import java.util.Scanner;
//public class trianglePattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println();
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print( "* ");
//
//            }
//            System.out.println();
//        }
//
//    }
//}

//print 1234 triangle


//public class trianglePattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println();
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print( j+" ");
//
//            }
//            System.out.println();
//        }
//
//    }
//}

//make a alphanumeric traingle

//public class trianglePattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println();
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                if(i%2!=0)System.out.print(j+" ");
//                else System.out.print( (char)(j+64)+" ");
//
//            }
//            System.out.println();
//        }
//
//    }
//}


//public class trianglePattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println();
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n+1-i; j++){
//                System.out.print( "* ");
//
//            }
//            System.out.println();
//        }
//
//    }
//}


//public class trianglePattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println();
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n+1-i; j++){
//               if(i%2!=0) System.out.print((char)(i+64)+" ");
//                else System.out.print( i+" ");
//
//            }
//            System.out.println();
//        }
//
//    }
//}

//odd number triangle
//public class trianglePattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println();
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//               System.out.print( (2*j-1)+" ");
//
//            }
//            System.out.println();
//        }
//
//    }
//}


//Floyd Triangle

public class trianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println();
        int n = sc.nextInt();
        int a =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print( a+" ");
                a++;

            }
            System.out.println();
        }

    }
}

