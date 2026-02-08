package Recursion;

public class hcf_Highest_common_Factor {
//    public static void main(String[] args){
//         int x = 12;
//         int y = 16;
//       // Without using recursion --> iterative
//        for (int i = x; i >= 1; i--) {
//            if (x % i == 0 && y % i == 0){
//                System.out.println(i);
//                break;
//            }
//        }
//
//    }
//      with recursion
    public static void main(String[] args){
         int x = 12;
         int y = 16;
         hcf(x,y,Math.min(x,y));
    }
    public static void hcf(int x, int y, int i){
        if (i == 0) return; // Base case

        if (x % i == 0 && y % i == 0) {
            System.out.println(i);
            return;
        }
        hcf(x,y,i - 1);
    }
}
