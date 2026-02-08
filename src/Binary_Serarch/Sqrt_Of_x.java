package Binary_Serarch;

import java.util.Scanner;

public class Sqrt_Of_x {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int mid = -1;
         int lo = 0, hi = x;
         while(lo <= hi){
              mid = lo + (hi - lo)/2;
             if (mid == x / mid){
                 System.out.println(mid);
                 break;
             }
             else if (mid*mid > x) hi = mid - 1;
             else if (mid*mid < x) lo = mid + 1;
         }
        System.out.println(mid);
         // mid * mid == x
        //  mid = x / mid
    }
}
