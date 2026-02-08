package Basics_Sorting;

public class check_If_Arrays_Is_Sorted_Or_Not {
    public static void main(String[] args){
         int[] arr = {5,7,7,8,8,9};
         int n = arr.length;
         boolean flag = true;       // sorted
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i+1]){
//                System.out.println("unsorted"); break;
//            }
//            else if (arr[i] <= arr[i+1]){
//                System.out.println("sorted");
//            }
//        }
        // mistake in code
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]){
                flag = false;    // false --> unsorted
                break;
            }
        }
        if (flag == true) System.out.println("Sorted");
        else System.out.println("Unsorted");
    }
}
