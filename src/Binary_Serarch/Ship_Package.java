package Binary_Serarch;

public class Ship_Package {
    public static void main(String[] args){
         // leetcode --> 1011

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n  = arr.length;
        int day = 5;

        // Step 1 --> calculate max and sum
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx,arr[i]);
            sum += arr[i];
        }

        // Step 2 --> Binary search
        int mincap = sum;
        int lo = mx;
        int hi = sum;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (isPossible(arr,mid,day) == true){
                mincap = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        System.out.println(mincap);
    }
    public static boolean isPossible (int[]arr, int cap, int day){
         int load = 0;
         int days = 1;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] <= cap){
                load += arr[i];
            }
            else {  // load + arr[i] > cap
                load = arr[i];
                days++;
            }
        }
        if (day < days) {
            return false;
        }

        else {
            return true;
        }
    }
}
