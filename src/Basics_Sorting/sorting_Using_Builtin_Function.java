package Basics_Sorting;


import java.util.Arrays;

public class sorting_Using_Builtin_Function {
    public static void main(String[] args){
         int[] arr = {3,5,6,4,3,8,9};

         for(int ele: arr){
         System.out.print(ele + " ");
         }
         System.out.println();

        Arrays.sort(arr);  // Builtin Function

       for(int ele: arr){
       System.out.print(ele + " ");
       }
       System.out.println();
    }
}
