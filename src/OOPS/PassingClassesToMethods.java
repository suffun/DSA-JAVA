package OOPS;

public class PassingClassesToMethods {
    public static class Product{
        String name;
        int price;
        void print(){
            System.out.println(name+" "+ price);
        }

    }
    private static void change(Product x){
        x.price= 900;


    }

    public static void main(String[] args) {
        Product c = new Product();
        c.name = "Handwash";
        c.price = 300;

        Product d = new Product();
        d.name = "Sunglasses";
        d.price = 7700;

        Product e = new Product();
        e.name = "earbuds";
        e.price = 10000;



        c.print();
        d.print();
        e.print();

        change(c);


        System.out.println(c.price);


    }



}
