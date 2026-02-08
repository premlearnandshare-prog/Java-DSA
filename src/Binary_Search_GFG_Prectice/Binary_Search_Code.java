package Binary_Search_GFG_Prectice;

public class Binary_Search_Code {
    public static void main(String[] args){
        int[]arr = {3,4,5,7,8,9,22,34,56,77};
        int target = 55;
        int n = arr.length;
//        // Linner search
//        boolean flag = false;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == target) {
//                flag = true;
//                break;
//            }
//        }
//        if (flag == true) System.out.println("Found");
//        else System.out.println("Not found");

        // Binary search
        boolean flag = false;
        int lo = 0, hi = n - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] == target) {
                flag = true;
                break;
            }
            else if (arr[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        if (flag == true) System.out.println("Found");
        else System.out.println("Not found");
    }

}
