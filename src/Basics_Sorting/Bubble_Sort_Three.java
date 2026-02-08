package Basics_Sorting;

public class Bubble_Sort_Three {
    public static void main(String[] args){
        int[] arr = {5,1,3,4,2};
        int n = arr.length;

        Print(arr);

        // Bubble sort - 3 (Optimized way)
//        for (int x = 0; x < n-1; x++) {   // n-1 passes
//            for (int i = 0; i < n - 1 - x; i++) {
//                if (arr[i] > arr[i + 1]){
//                    // swap
//                    swap(arr,i,i+1);
//                }
//            }
//            // if this pass has sorted or not
//            boolean flag = true;
//            for (int i = 0; i < n - 1 - x; i++) {
//                if (arr[i] > arr[i + 1]){
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag == true)  break;
//        }
        for (int x = 0; x < n-1; x++) {
            // n-1 passes
            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]){
                    // swap
                    swap(arr,i,i+1);
                    flag = false;
                }
            }
            if (flag == true)  break;
        }

        Print(arr);
    }
    public static void swap(int[]arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void Print(int[]arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
