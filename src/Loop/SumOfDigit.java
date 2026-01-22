package Loop;
import java.util.Scanner;
//public class SumOfDigit {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n!=0){
//            int lastDigit = n%10;
//            sum +=lastDigit;
//            n/=10;
//        }
//        System.out.println(sum);
//
//    }
//}

//WAP to print product of digits

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multiply = 1;
        while(n!=0){
            int lastDigit = n%10;

                multiply *=lastDigit;
                n/=10;
        }
        System.out.println(multiply);

    }
}


//print the product of all non zero digits of given number

//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int multiply = 1;
//        while(n!=0){
//            int lastDigit = n%10;
//            if(lastDigit!=0){
//                multiply *=lastDigit;
//
//            }
//
//            n/=10;
//        }
//        System.out.println(multiply);
//
//    }
//}