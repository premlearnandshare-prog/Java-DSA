package Binary_Search_GFG_Prectice;

import java.util.Scanner;

public class sqrt_Of_X {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int lo = 1;
         int hi = x;
         while (lo <= hi){
             int mid = lo + (hi - lo)/2;
             if(mid == x/mid){
                 System.out.println(mid);
                 break;
             }
            else if(mid > x/mid) hi = mid - 1;
            else if(mid < x/mid) lo = mid + 1;

         }
    }
}
