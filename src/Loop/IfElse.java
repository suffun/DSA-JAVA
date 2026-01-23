package Loop;
import java.util.Scanner;
public class IfElse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n +" : is even number");
        }
        else{
            System.out.println(n +" : is Odd number");
        }
    }
}
