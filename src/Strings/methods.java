package Strings;

public class methods {
    public static void main(String[] args) {
        String name = "Alice";    // Line 1
        change(name);             // Line 2
        System.out.println(name); // Line 3
    }

    public static void change(String s) {
        s = "Bob";                // Line 4
    }
}