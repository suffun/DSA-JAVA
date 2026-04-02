package Strings;

public class Substring {
    public static void main(String[] args) {
        String s = "sufi";
        for(int i = 0; i<=s.length(); i++){
            for(int j = i; j<=s.length(); j++){
                System.out.print(s.substring(i,j)+ " ");
            }
            System.out.println();
        }

    }
}
