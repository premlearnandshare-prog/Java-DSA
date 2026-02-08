package Binary_Serarch;

public class bs {
    public static void main(String[] args){
         int[]arr = {10,15,21,34,81,105,180,500};
         int n = arr.length;
         int target = 21;
         boolean flag = false;
         int low = 0, hi = n - 1;
         while (low <= hi){
//             int mid = (low + hi)/2;
             int mid = low + ((low + hi)/2);
             if (arr[mid] < target){
                 low = mid + 1;
             }
             else if (arr[mid] > target){
                 hi = mid - 1;
             }
             else if (arr[mid] == target){
                 flag = true;
                 break;
             }
         }
         if (flag == true) System.out.println("Target present");
         else System.out.println("Target not found");
    }
}
