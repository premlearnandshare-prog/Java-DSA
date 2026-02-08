package Binary_Serarch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class find_first_and_last_position_of_Element_in_sorted_array {
    public static void main(String[] args){

        int[]arr = {10,10,20,20,20,20,20,30,30,30,40,40};
        int n = arr.length;
        int target = 20;
        System.out.println(Arrays.toString(searchRange(arr,target)));

    }
    public static int[] searchRange(int[]arr,int target){
        // leetcode 34
        int[]ans = {-1,-1};
        int n = arr.length;
        // first check if element is present (Binary code)
        int low = 0, hi = n - 1;
        boolean flag = false;
        while(low<=hi){
            int mid = low + (hi - low)/2;
            if (arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid] >= target) hi = mid - 1;
            else if(arr[mid] <= target) low = mid + 1;
        }
        if (flag == false) return ans;
        // now find lower bound
        int lb = n;
        low = 0;
        hi = n - 1;
        while(low<=hi){
            int mid = low + (hi - low)/2;
            if (arr[mid] >= target){
                lb = Math.min(lb,mid);
                hi = mid - 1;
            }
            else low = mid + 1;
        }
        ans[0] = lb;

        // now find Upper_Bound
        int Ub = n;
        low = 0;
        hi = n - 1;
        while(low<=hi){
            int mid = low + (hi - low)/2;
            if (arr[mid] > target){
                Ub = Math.min(Ub,mid);
                hi = mid - 1;
            }
            else low = mid + 1;
        }
        ans[1] = Ub - 1;
        return ans;
    }
}
