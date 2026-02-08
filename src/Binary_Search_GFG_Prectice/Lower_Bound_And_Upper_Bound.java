package Binary_Search_GFG_Prectice;

public class Lower_Bound_And_Upper_Bound {
    public static void main(String[] args){
        int[]arr = {2,4,6,8,8,12};
        int target = 4;
        int n = arr.length;

        // lower bound
        int lb = n;
        // Binary search
        int lo = 0, hi = n - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] >= target) {
                lb = mid;
                hi = mid - 1;
            }

            else lo = mid + 1;
        }
        System.out.println(lb);

        // Upper bound
        int ub = n;
        // Binary search
         lo = 0;
         hi = n - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] > target) {
                ub = mid;
                hi = mid - 1;
            }

            else lo = mid + 1;
        }
        System.out.println(ub);
    }
}
