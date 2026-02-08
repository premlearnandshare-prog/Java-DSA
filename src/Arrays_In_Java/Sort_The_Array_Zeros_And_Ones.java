package Arrays_In_Java;

import java.lang.reflect.Method;

public class Sort_The_Array_Zeros_And_Ones {
    //Question ---> Sort the array of 0s and 1s
    // segregate 0s and 1s
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
//        Method 1 ==> two pass Solution
//        System.out.println();
//        int NoOfZeros = 0;
//        int NoOfOnes = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0){
//                NoOfZeros++;
//            }
//            else {
//                NoOfOnes++;
//            }
//        }
//        for (int i = 0; i < NoOfZeros; i++) {
//            arr[i] = 0;
//        }
//        for (int i =  NoOfZeros; i < n; i++) {
//            arr[i] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        //Method 2 One Pass Solution
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0) i++;
            if (arr[j] == 0) j--;
            if (i > j) break;
            if (arr[i] == 1 && arr[j] == 0) {
                //Swap
                arr[i] = 0;
                arr[j] = 1;
            }
            for (int ele: arr) {
                System.out.print(ele + " ");
            }
            System.out.println();

        }
    }
}
