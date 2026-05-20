package Recursion;

public class FunctionCallingItself {
    public static void main(String[] args) {
        ajay(5);
    }
    public static void ajay(int n) {
        if(n==0) return;
        System.out.println(n);
        ajay(n-1);


    }
}
