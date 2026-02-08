package Binary_Serarch;

public class First_Missing_Element {
    public static void main(String[] args){
         int[]arr = {0,1,2,3,7};
         int n = arr.length;
         int missing = n;
         int lo = 0;
         int hi = n - 1;
         while (lo <= hi){
             int mid = lo + (hi - lo)/2;
             if (arr[mid] == mid) lo = mid + 1;
             else {
                 missing = mid;
                hi = mid - 1;
             }
         }
        System.out.println(missing);
    }
}
