package Binary_Search_GFG_Prectice;

public class find_first_and_last_position_of_Element_in_sorted_array {
    public static void main(String[] args){
         int[]arr = {2,2,2,3,3,6};
         int x = 2;
         int n = arr.length;
         int[] ans = {-1,-1};

         nextstep(arr,ans,x,n);
         for(int ele: ans){
         System.out.print(ele + " ");
         }
         System.out.println();

    }
    public static int[] nextstep(int[]arr, int[]ans, int x, int n){
        int lo, hi;
        // Step 1 --> check x present or not
        boolean flag = false;
        lo = 0; hi = n - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] == x) {
                flag = true;
                break;
            }
            else if (arr[mid] > x) hi = mid - 1;
            else lo = mid + 1;
        }
        if (flag == false) return ans;

        // lower bound
        int lb = n;
        // Binary search
        lo = 0; hi = n - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] >= x) {
                lb = mid;
                hi = mid - 1;
            }

            else lo = mid + 1;
        }
        ans[0] = lb;

        // Upper bound
        int ub = n;
        lo = 0; hi = n - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] > x) {
                ub = mid;
                hi = mid - 1;
            }

            else lo = mid + 1;
        }
        ans[1] = ub - 1;

        return ans;
    }
}
