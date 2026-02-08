package Basics_Sorting;

public class Selection_Sort {
    public static void main(String[] args){
         int[]arr = {10,-4,20,1,-6,8};
         int n = arr.length;
         print(arr);
//         int min = Integer.MAX_VALUE;
//         int min_Index = -1;
//        for (int i = 0; i < n; i++) {
//           if (arr[i] < min){
//               min = arr[i];
//               min_Index = i;
//           }
//        }
//        System.out.println(min + " " + min_Index);

        // outer loop for passes
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int min_Index = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    min_Index = j;
                }
            }
            // swap --> arr[i] and arr[min_index]
            swap(arr,i,min_Index);
         }
        print(arr);
    }
    public static void print(int[]arr){
         for(int ele: arr){
         System.out.print(ele + " ");
         }
         System.out.println();
    }
    public static void swap(int[]arr,int i, int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
}
