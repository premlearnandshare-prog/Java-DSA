package Basics_Sorting;

public class insetion_sorting {
    public static void main(String[] args){
         int[]arr = {5,4,3,2,1};
         int n = arr.length;
        // selection sort
        for (int i = 0; i <= n -2; i++) {
            int j = i + 1;
            while (j > 0  && arr[j] < arr[j - 1]){
                // swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for(int ele: arr){
        System.out.print(ele + " ");
        }
        System.out.println();
    }
}
