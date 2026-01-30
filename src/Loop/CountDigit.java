//package Loop;
//import java.util.Scanner;
//public class CountDigit {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        if(n==0) count++;
//        while(n!=0){
//            n/=10;
//            count++;
//        }
//        System.out.println(count);
//
//    }
//}
//package Loop;
//import java.util.Scanner;
//public class CountDigit {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n==0) n = 7;
//        int count = 0;
//        while(n!=0){
//            n/=10;
//            count++;
//        }
//        System.out.println(count);
//    }
//}

//package Loop;
//import java.util.Scanner;
//public class CountDigit {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n!=0){
//            sum += n%10;
//            n/= 10;
//        }
//        System.out.println((sum > 0) ? sum : -sum);
//    }
//}

//Reverse of a number

//import java.util.Scanner;
//public class CountDigit {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n!=0){
//            sum += n%10;
//            n/= 10;
//        }
//        System.out.println((sum > 0) ? sum : -sum);
//    }
//}


import java.util.Scanner;
public class CountDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n/= 10;
        }
        System.out.println(sum);
    }
}

