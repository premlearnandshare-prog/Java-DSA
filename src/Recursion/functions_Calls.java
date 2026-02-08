package Recursion;

public class functions_Calls {
    public static void mango(){
        System.out.println("Mango");
    }
    public static void banana(){
        mango();
        System.out.println("banana");
    }
    public static void apple(){
        banana();
        System.out.println("Apple");
        mango();
    }
    public static void main(String[] args){
        System.out.println("main");
        apple();
    }
}
