package Binary_Search_GFG_Prectice;

public class Peak_Index_In_a_mountain_Array {
    public static void main(String[] args){
        int[]arr = {4,5,6,7,10,4,3,1};
        int n = arr.length;
        int peak = -1;
        int lo = 0, hi = n - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(mid >0 && mid < n - 1 && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                peak = mid;
                break;
            }
            else if(arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1])  hi = mid - 1;
            else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])  lo = mid + 1;
        }

        System.out.println(peak);
    }
}
