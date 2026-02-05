package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {22,33,44,55};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }

    public static void change(int[] y) {
        y[2] =99;

    }
}
