package Strings;

public class CompareToStringMethod {

    public static int compareTo(String a, String b) {

        int n = a.length();
        int m = b.length();

        int len = Math.min(n, m);

        // compare character by character
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }

        // if all characters same, return length difference
        return n - m;
    }

    public static void main(String[] args) {
        String a = "sufiyan";
        String b = "khan";

        System.out.println(compareTo(a, b));
    }
}