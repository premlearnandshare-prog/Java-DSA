package Prem_Prectice_Sorting;

public class Selection_Sort {
    public static void main(String[] args){
         int []arr = {10,4,5,3,2,5,7,-5};
         int n = arr.length;
         // outer loop --> passes
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int min_Index = -1;
            for (int j = i; j < n; j++) {
                if (arr[i] < min){
                    min = arr[j];
                    min_Index = j;
                }
            }
            // swap --> arr[i] and arr[min_Index]
            swap(arr,i,min_Index);
        }
        print(arr);
    }
    public static void swap(int []arr, int i, int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
    public static void print(int []arr){
         for(int ele: arr){
         System.out.print(ele + " ");
         }
         System.out.println();
    }
}
