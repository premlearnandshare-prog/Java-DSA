package Binary_Search_GFG_Prectice;

public class Floor_in_a_sorted_array {
    public static void main(String[] args){
         int[]arr = {1,2,4,10,10,12,19};
         int n = arr.length;
         int x = 5;
         int floor = -1;
         int lo = 0, hi = n - 1;
         while (lo <= hi){
             int mid = lo + (hi - lo)/2;
             if (arr[mid] <= x){
                 floor = mid;
                 hi = mid - 1;
             }
             else{  // arr[mid] > x
                 lo = mid + 1;
             }
         }

    }
}
