package Loop;
import java.util.Scanner;
//public class ReverseOfNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int rev = 0;
//        while(n!=0){
//            int lastDigit= n%10;
//            rev *= 10;
//            rev += lastDigit;
//            n/=10;
//        }
//        System.out.println(rev);
//    }
//
//}

//write a program to print the sum of a given number and its reverse


public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // original number
        int original = n;       // store original
        int rev = 0;

        while(n != 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }

        int sum = original + rev;
        System.out.println("Original: " + original);
        System.out.println("Reverse : " + rev);
        System.out.println("Sum     : " + sum);
    }
}