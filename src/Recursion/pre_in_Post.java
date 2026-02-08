package Recursion;

public class pre_in_Post {
    public static void main(String[] args){
        pip(3);
    }
    public static void pip(int n){
         if (n == 0) return;
        System.out.println("Pre " + n);  // Pre
        pip(n - 1);
        System.out.println("in " + n);  // in
        pip(n - 1);
        System.out.println("Post " + n);  // Post
    }
}
