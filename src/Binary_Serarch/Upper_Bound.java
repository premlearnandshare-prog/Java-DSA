package Binary_Serarch;

import java.util.Scanner;

public class Upper_Bound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //int[] arr = {10,20,30,30,40,50,60,70};
         n = arr.length;
        //int target = 80;
        int target = sc.nextInt();
        int Ub = n;
        int low = 0, hi = n - 1;
        while(low <= hi){
            int mid = low + (hi - low)/2;
            if (arr[mid] > target){
                Ub = Integer.min(Ub,mid);
                hi = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(Ub);
    }
}
