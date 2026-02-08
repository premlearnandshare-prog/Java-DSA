package Prem_Prectice_Sorting;

public class Selection_Sort_In_one_Sort {
    public static void main(String[] args){
         int[] arr = {5,4,3,2,1};
         int n = arr.length;
         // Selection sort
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            swap(arr,i,mindex);
        }
        print(arr);
    }
    public static void swap(int[] arr, int i,int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
    public static void print(int[] arr){
         for(int ele: arr){
         System.out.print(ele + " ");
         }
         System.out.println();
    }
}
