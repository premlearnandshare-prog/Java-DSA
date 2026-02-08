package Binary_Serarch;

import java.util.Scanner;

public class Search_In_a_Roteted_Sorted_Array {
    public static void main(String[] args){
         // Leetcode 33
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 0;
        int lo = 0, hi = n - 1;
        boolean flag = false;
        int mid = -2;
        while (lo <= hi){
             mid = lo + (hi - lo)/2;
            if (arr[mid] == target) {
                flag = true;
                break;
            }
            // check  left sorted or not
            if (arr[lo] <= arr[mid]){
                if(arr[lo] <= target && target <= arr[mid]){
                    hi = mid - 1;
                }
                else{
                    lo = mid + 1;
                }
            }
            else {  // arr[mid] <= arr[hi]
                // check  Right sorted or not
                if(arr[mid] <= target && target <= arr[hi]){
                    lo = mid + 1;
                }
                else{
                    hi = mid - 1;
                }
            }
        }
        if (flag == true) System.out.println(mid);
        else System.out.println(-1);


    }
}
