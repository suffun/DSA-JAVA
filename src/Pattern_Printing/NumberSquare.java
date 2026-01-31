package Pattern_Printing;
import java.util.Scanner;

//public class NumberSquare {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter");
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print(j+ " ");
//
//            }
//            System.out.println();
//        }
//    }
//}
//public class NumberSquare {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter");
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print(i+ " ");
//
//            }
//            System.out.println();
//        }
//    }
//}

//public class NumberSquare {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter");
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print((char)(i+64)+ " ");
//
//            }
//            System.out.println();
//        }
//    }
//}

//
//public class NumberSquare {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print((char)(j+64) + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}


//public class NumberSquare {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }
//
//    }
//}
//public class NumberSquare {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print((char)(i+64)+ " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//public class NumberSquare {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print((char)(i+64)+ " ");
//            }
//            System.out.println();
//        }
//
//    }
//}
public class NumberSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%2!=0){
                    System.out.print((char)(i+64)+ " ");
                }
                else{
                    System.out.print((char)(i+96)+ " ");
                }
            }
            System.out.println();
        }

    }
}