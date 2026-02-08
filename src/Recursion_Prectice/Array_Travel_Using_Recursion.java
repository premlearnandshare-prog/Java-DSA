package Recursion_Prectice;

public class Array_Travel_Using_Recursion {
    public static void main(String[] args){
         int[]arr = {4,5,6,4,6,78,5,67,4,7,4};
//         // for each loop
//        for(int ele: arr){
//        System.out.print(ele + " ");
//        }
//        System.out.println();

//        // for loop --> iterative
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        print(0,arr);
    }
    public static void print(int i, int[]arr){
        if (i >= arr.length) return;
        System.out.print(arr[i] + " ");
         print(i + 1,arr);
    }
}
