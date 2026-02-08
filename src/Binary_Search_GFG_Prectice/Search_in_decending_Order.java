package Binary_Search_GFG_Prectice;

public class Search_in_decending_Order {
    public static void main(String[] args){
         int[]arr = {9,8,7,5,4,3,2,1};
         int n = arr.length;
         int x =6;
         boolean flag = false;
         int lo = 0, hi = n - 1;
         while (lo <= hi){
             int mid = lo +(hi - lo)/2;
             if (arr[mid] == x){
                 flag = true;
                 break;
             }
             else if (arr[mid] > x) lo = mid + 1;
             else hi = mid - 1;
         }
         if (flag == true) System.out.println("Found");
         else System.out.println("Not found");
    }

}
