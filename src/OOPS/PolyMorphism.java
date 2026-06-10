package OOPS;

public class PolyMorphism {
    public static class Pikachu{
        void speak(){
            System.out.println("Pika pika");
        }

    }
    public static class Dog{
        void speak(){
            System.out.println("Bhau bhau");
        }

    }public static class Lion{
        void speak(){
            System.out.println("GRRRRRRRRRRRRRRRRRRRRRrrrrr");
        }

    }public static class Human{
        void speak(){
            System.out.println("hello uncle ji");
        }

    }
    public static void main(String[] args) {
        Pikachu p = new Pikachu();
        Dog d = new Dog();
        Lion l = new Lion();
        Human h = new Human();
        p.speak();
        d.speak();
        l.speak();
        h.speak();


    }


}
