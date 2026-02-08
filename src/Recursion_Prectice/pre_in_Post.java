package Recursion_Prectice;

public class pre_in_Post {
    public static void main(String[] args){
         pip(3);
    }
    public static void pip(int n){
        if ( n == 0) return;
        System.out.println("pre " + n); // Pre
        pip(n - 1); // call
        System.out.println("in " + n); // in
        pip(n - 1); // call
        System.out.println("post " + n); // Post
    }
}
