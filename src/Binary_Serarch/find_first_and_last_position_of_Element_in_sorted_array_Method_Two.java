package Binary_Serarch;

import java.util.Arrays;

public class find_first_and_last_position_of_Element_in_sorted_array_Method_Two {
    public static void main(String[] args){
        int[]arr = {10,10,20,20,20,20,20,30,30,30,40,40};
        int n = arr.length;
        int target = 20;
        System.out.println(Arrays.toString(searchRange(arr,target)));

    }
    public static int[] searchRange(int[]arr,int target){
        // leetcode 34
        int n = arr.length;
        int[] ans = new int[2];
        int low,hi;
        // first position
        int fp = -1;
        low = 0;
        hi = n - 1;
        while(low<=hi){
            int mid = low + (hi - low)/2;
            if(arr[mid] == target){
                if(mid > 0 && arr[mid] == arr[mid - 1])  hi = mid - 1;
                else{
                    fp = mid;
                    break;
                }
            }
            else if(arr[mid] > target) hi = mid - 1;
            else if(arr[mid] < target) low = mid + 1;
        }


        // last position
        int lp = -1;
        low = 0;
        hi = n - 1;
        while(low<=hi){
            int mid = low + (hi - low)/2;
            if(arr[mid] == target){
                if(mid + 1 < n && arr[mid] == arr[mid + 1])  low = mid + 1;
                else{
                    lp = mid;
                    break;
                }
            }
            else if(arr[mid] > target) hi = mid - 1;
            else if(arr[mid] < target) low = mid + 1;
        }

        ans[0] = fp;
        ans[1] = lp;

        return ans;

    }
}
