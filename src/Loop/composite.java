//package Loop;
//import java.util.Scanner;
//public class composite {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean flag = true;
//        for(int i=2; i<=Math.sqrt(n); i++){
//            if(n%i==0){
//                flag = false;
//                break;
//            }
//        }
//        if(n==1) System.out.println("Neither prime nor composite");
//        else if(flag == false) System.out.println("Composite number");
//        else System.out.println("Prime number");
//    }
//}

//take number n input and print all of his factor

package Loop;
import java.util.Scanner;
public class composite {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(i);
                System.out.println(n%i);
            }
        }
        }
    }