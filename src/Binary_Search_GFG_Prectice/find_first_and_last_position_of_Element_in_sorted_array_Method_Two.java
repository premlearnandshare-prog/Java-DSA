package Binary_Search_GFG_Prectice;

public class find_first_and_last_position_of_Element_in_sorted_array_Method_Two {
    public static void main(String[] args){
         int[]arr = {10,10,20,20,20,20,20,30,30,30,40,40};
         int x = 20;
         int n = arr.length;
         int[]ans = {-1,-1};

         nextstep (arr,ans,x,n);

         for(int ele: ans){
         System.out.print(ele + " ");
         }
         System.out.println();
    }
    public static int[] nextstep(int[]arr, int[]ans, int x, int n){
        // first position
         int fp = -1;
         // Binary search
        int lo = 0, hi = n - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] == x){
                if (mid > 0 &&arr[mid] == arr[mid - 1]){
                    hi = mid - 1;
                }
                else{
                    fp = mid;
                    break;
                }
            }
            else if (arr[mid] > x) hi = mid - 1;
            else lo = mid - 1;
        }
        ans[0] = fp;

        // last position
        int lp = -1;
        // Binary search
        lo = 0; hi = n - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] == x){
                if (mid < n-1 &&arr[mid] == arr[mid + 1]){
                    lo = mid + 1;
                }
                else {
                    lp = mid;
                    break;
                }
            }
            else if (arr[mid] > x) hi = mid - 1;
            else lo = mid - 1;
        }
        ans[1] = lp;

        return ans;
    }
}
