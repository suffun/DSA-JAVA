package OOPS;

public class PrivateKeyword {

    public static  class Student{
        String name;
        int rno;
        private double cgpa;

        void print(){      //Getter
            System.out.println(name+" "+cgpa+" "+rno);
        }

        double getCgpa(){
            return cgpa;

        }

        void setCgpa(double x){
            cgpa = x;

        }

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.print();
        s1.setCgpa(9.5);

        System.out.println(s1.getCgpa());

    }
}
