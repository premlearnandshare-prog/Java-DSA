package Binary_Serarch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kth_Closest_Element {
    public static void main(String[] args){
         int[]arr = {1,3,5,8,9,10};
         int n = arr.length;
         int x = 6;
         int k = 4;
        List<Integer> ans = findClosestElements(arr, k, x);
        for(int num : ans){
            System.out.print(num + " ");
        }

    }
    public static List<Integer> findClosestElements(int[]arr, int k, int x){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if (x < arr[0]){
            // print first kth element of array
            for(int i=0;i<k;i++){
                ans.add(arr[i]);
            }
            return ans;
        }

        if (x > arr[n-1]){
            // print first kth element of array
            for(int i=n-1;i>n-k;i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }

        // lower bound code
        int lb = n;
        int lo = 0;
        int hi = n - 1;
        while (lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] >= x){
                lb = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }

        // Two Pointer
        int i = lb - 1;
        int j = lb;
        while (k>0 && i>=0 && j<n){
            int di = Math.abs(x - arr[i]);
            int dj = Math.abs(x - arr[j]);
            if (di <= dj){
                ans.add(arr[i]);
                i--;
            }
            else { // di > dj
                ans.add(arr[j]);
                j++;
            }
            k--;

            while (i<0 && k>0){
                ans.add(arr[j]);
                j++;
                k--;
            }

            while (j>=n && k>0){
                ans.add(arr[i]);
                i--;
                k--;
            }
            Collections.sort(ans);

        }
        return ans;
    }
}
