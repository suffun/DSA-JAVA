package Recursion;

public class Globalvariable {
    static int x = 69;
    public static void main(String[] args) {
        print();
         x = 30;
        System.out.println(x);
        int x = 2;
        System.out.println(x);

    }
    public static void print() {

        System.out.println(x);



    }
}
