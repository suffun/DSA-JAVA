package Strings;

public class CompareTo {

    public static void main(String[] args) {
        String a = "sufiyan";
        String b = "farhan";
        System.out.println(compareTo(a,b));
    }
    public static int compareTo(String a, String b) {
       int n1 = a.length();
       int n2 = b.length();
       int minLength = Math.min(n1,n2);

       for(int i = 0; i< minLength; i++){
           char charA = a.charAt(i);
           char charB = b.charAt(i);

           if(charA != charB) {
               return charA - charB;
           }
       }
        return n1 - n2;
    }

}
