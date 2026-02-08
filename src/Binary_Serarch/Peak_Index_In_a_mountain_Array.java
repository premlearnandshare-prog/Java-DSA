package Binary_Serarch;

import java.util.Scanner;

public class Peak_Index_In_a_mountain_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//         int[]arr = {10,20,30,40,50,30,20,4};
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
          n = arr.length;
//         // Method 1
//        for (int i = 1; i < n-1; i++) {
//            if(arr[i] > arr[i + 1] && arr[i] > arr[i - 1]){
//                System.out.println(i);
//            }
//        }
        // Method 2 --> Binary search
        int lo = 1;
        int hi = n - 2;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]){
                System.out.println(mid); break;
            }
            else if(arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]){
                hi = mid - 1;
            }
            else if(arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1])
            {
                lo = mid + 1;
            }
        }
    }
}
