package Methods;
import java.util.Scanner;
//public class Combination {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int nFact = 1;
//        for(int i=1; i<=n; i++){
//            nFact *=i;
//        }
//        int rFact = 1;
//        for(int i=1; i<=r; i++){
//            rFact *=i;
//        }
//        int n_rFact = 1;
//        for(int i=1; i<=n-r; i++){
//            n_rFact *=i;
//        }
//
//        int ncr = nFact/(n_rFact*rFact);
//        System.out.println(ncr);
//
//    }
//}


//public class Combination {
//    public static int fact(int x) {
//        int xFact = 1;
//        for(int i=1; i<=x; i++){
//            xFact *=i;
//        }
//        return xFact;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int nFact = fact(n);
//        int rFact = fact(r);
//        int n_rFact = fact(n-r);
//        int ncr = nFact/(n_rFact*rFact);
//        System.out.println(ncr);
//
//    }
//}

//more precise

public class Combination {
    public static int fact(int x) {
        int xFact = 1;
        for(int i=1; i<=x; i++){
            xFact *=i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(n-r)*fact(r));
        System.out.println(ncr);

    }
}
