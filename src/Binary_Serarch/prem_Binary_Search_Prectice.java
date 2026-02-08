package Binary_Serarch;

public class prem_Binary_Search_Prectice {
    public static void main(String[] args){
         int[]arr = {10,20,30,40,50,60,70};
         int n = arr.length;
        int target = 50;
        boolean flag = false;
       // Binary search
        int low = 0, hi = n - 1;
        while (low <= hi){
            int mid = (low + hi)/2;
            if (arr[mid] == target) {
                flag = true;
                break;
            }
            else if (arr[mid] > target){
                hi = mid - 1;
            }
            else if (arr[mid] < target){
                hi = mid + 1;
            }
        }
        if (flag == true) System.out.println("found");
        else System.out.println("Not found");
    }
}
