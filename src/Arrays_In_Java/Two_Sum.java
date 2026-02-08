package Arrays_In_Java;

import javax.naming.PartialResultException;

public class Two_Sum {
    // Two sum gfg Practice --> google per type karo
    // Question - Find the doublet in the Array whose
    // sum is equal to the given value
//    public static void main(String[] args){
//        int[]arr = {3,-1,8,5,4,9,-2};
//        int x = 9;
//        // Solution
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j< arr.length;j++){
//                if (arr[i]+arr[j] == x){
//                    System.out.println(arr[i] + " " + arr[j]);
//                }
//            }
//        }
//    }
    public static void main(String[] args) {
        int[] arr = {7, 76, 5, 4, 7, 5};
        int x = 7;
        twosum(arr, x);
    }
    public static boolean twosum(int arr[],int target){
        int n = arr.length;
                // Solution
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j< arr.length;j++){
                if (arr[i]+arr[j] == target){
                  return true;
                }
            }
        }
        return false;
    }
}
