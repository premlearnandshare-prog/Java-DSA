package Prem_Prectice_Sorting;

public class Bubble_Sort {
    public static void main(String[] args){
         int[] arr = {5,4,3,2,1};
         print(arr);
         int n = arr.length;
         // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true; // --> sorted
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr,j,j+1);
                    flag  = false;
                }
            }
            if (flag == true) break;
        }
        print(arr);
    }
    public static void swap(int[]arr,int i, int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
    public static void print(int[]arr){
        for(int ele: arr){
        System.out.print(ele + " ");
        }
        System.out.println();
    }

}
