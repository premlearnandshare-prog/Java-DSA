package Binary_Serarch;
public class Lower_Bound {
    public static void main(String[] args){
         int[] arr = {10,20,30,30,40,50,60,70};
        int target = 80;
         int n = arr.length;
         int lb = n;
         int low = 0, hi = n - 1;
         while(low <= hi){
            int mid = low + (hi - low)/2;
             if (arr[mid] >= target){
                 lb = Integer.min(lb,mid);
                 hi = mid - 1;
             }
             else{
                 low = mid + 1;
             }
         }
        System.out.println(lb);
    }
}
