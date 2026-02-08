package OOPs_In_Java;

public class polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("bhau bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Grrrrrrrrrr");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static class pikachu{
        void speak(){
            System.out.println("pika pika");
        }
    }
    public static void main(String[] args){
        Dog d = new Dog();
        Human h = new Human();
        Cat c = new Cat();
        Lion l = new Lion();

        d.speak();
        h.speak();
        c.speak();
        l.speak();
    }
}
