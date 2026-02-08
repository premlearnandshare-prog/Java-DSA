package Recursion_Prectice;

import java.util.ArrayList;
import java.util.List;

public class print_All_The_Subset_Of_Array {
    public static void main(String[] args){
        int[]arr = {1,2,3};
        List<Integer> ravi = new ArrayList<>(); // AL
        List<List<Integer>> ans = new ArrayList<>(); //2D AL
        subset(0,arr,ravi,ans);
        
        // Print 2D-ArrayList
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void subset(int i, int[]arr,List<Integer> ravi,List<List<Integer>> ans){
         if (i == arr.length){ // Base case
            ans.add(new ArrayList<Integer>(ravi));
            return;
         }
         
         ravi.add(arr[i]);
         subset(i + 1,arr,ravi,ans);

         ravi.remove(ravi.size() - 1);
        subset(i + 1,arr,ravi,ans);
    }
}
