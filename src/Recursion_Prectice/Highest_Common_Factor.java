package Recursion_Prectice;

public class Highest_Common_Factor {
    public static void main(String[] args){
         int x = 12, y = 16;
         // iterative Method
//        for (int i = Math.min(12,16); i >= 1; i--) {
//            if (x % i == 0 && y % i == 0){
//                System.out.println(i);
//                break;
//            }
//        }
        // recursion
        print(Math.min(x,y),x,y);
    }
    public static void print(int i, int x, int y){
        if (i == 0) return;
        if (x % i == 0 && y % i == 0){
            System.out.println(i);
            return;
        }
        print(i - 1,x,y);
    }
}
