package Recursion_Prectice;

public class hcf_M_Two {
    public static void main(String[] args){
         int x = 12, y = 16;
        System.out.println( print(x,y));
    }
    public static int print(int x, int y){
         if (y == 0) return x; // BAse case
         return print(y,x % y);
    }
}
