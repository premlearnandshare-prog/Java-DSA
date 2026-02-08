package Prem_Prectice_Sorting;

public class Bubble_Sort_oNE {
    public static void main(String[] args){
         int[]arr = {3,5,1,4,2,0};
         int n = arr.length;

         // bubble sort 1
        for (int x = 0; x < n-1; x++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    swap(arr ,i ,i + 1);
                }
            }
        }
        Print(arr);
    }
    public static void swap(int[]arr,int i , int j){
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
