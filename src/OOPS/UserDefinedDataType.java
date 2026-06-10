package OOPS;
import java.util.Scanner.*;


public class UserDefinedDataType {
    public static class Sufiyan{
        double cgpa;
        String name;
        int height;
        int rollno;
    }
    public static void main(String[] args) {
        Sufiyan s1 = new Sufiyan();
        s1.name = "sufiyan khan";
        s1.cgpa = 9.9;

        Sufiyan s2 = new Sufiyan();
        s2.name = "Rakesh";
        s2.cgpa = 9.9;


        System.out.println(s1.name);

    }

}
