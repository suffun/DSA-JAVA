package Recursion;

public class TowerOfHanoi {
     public static void main(String[] args) {
         hanoi(3,'A','B','c');
     }

    private static void hanoi(int n, char src, char helper, char dest) {
         if(n==0) return;
//         n-1 disk from A to B via c
        hanoi(n-1,src,dest,helper);
        System.out.println(src+"->"+dest);
        hanoi(n-1,helper,src,dest);
    }
}
