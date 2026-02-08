package Binary_Serarch;

public class Find_the_Smallest_Divisor_Given_an_Threshold_M_Two {
    public static void main(String[] args){
        int[] arr = {5,1,9,2};
        int t = 6;
        int n = arr.length;
        // step 1 --> Max value find karo
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx,arr[i]);
        }

        int d = 1;
        int lo = 1, hi = mx;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            // isLess --> sum <= t
            if (isLess(arr,mid,t)){
                d = mid;
                hi = mid - 1;
            }
            else{  // sum > t
                lo = mid + 1;
            }
        }

        System.out.println(d);
    }
    public static boolean isLess (int[]arr, int mid, int t){
         int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % mid == 0) sum += arr[i]/mid;
            else sum += arr[i]/mid + 1;
        }
        if (sum <= t) return true;
        else { // sum > t
            return false;
        }
    }
}
