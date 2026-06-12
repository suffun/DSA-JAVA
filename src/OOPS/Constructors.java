package OOPS;

public class Constructors {
    public static class Laptops{
        String name;
        int price;
        int storage;

        Laptops(){


        }

        Laptops(String x,int y, int z){
            name = x;
            price =y;
            storage = z;

        }
        void print(){
            System.out.println(name+" "+price+" "+storage);
        }
    }
    public static void main(String[] args) {
        Laptops s1 = new Laptops("m2",80000,256);
        s1.print();

    }
}
