//package Loop;
//
//import java.util.Scanner;
//
//public class questions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i<=2*n-1; i+=2){
//            System.out.println(i+" ");
//        }
//
//    }
//}

package Loop;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2 , r = 4 ;
        for(int i = 1; i<=2*n-1; i+=2){
            System.out.println(a+" ");
            a *= r ;
        }

    }
}