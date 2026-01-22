package Methods;

//public class PassingArguments {
//    public static void greet(String name) {
//        System.out.println("hi " +name);
//    }
//
//    public static void main(String[] args) {
//        greet("sufiyan");
//    }
//}

//public class PassingArguments {
//    public static void sum(int a, int b) {
//        System.out.println("sum is : "+ (a+b));
//    }
//
//    public static void main(String[] args) {
//        sum(9,9);
//    }
//}


public class PassingArguments {
    public static void data(String name, int age, String year, String div) {
        System.out.println("Hey i am "+name+" my age is "+age+". I am in "+year+" my div is "+div );
    }

    public static void main(String[] args) {
        data("sufiyan",22,"3rd year","B");
    }
}
