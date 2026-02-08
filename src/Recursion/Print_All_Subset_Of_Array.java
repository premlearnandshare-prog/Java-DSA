package Recursion;

import java.util.ArrayList;

import java.util.List;

public class Print_All_Subset_Of_Array {
    public static void main(String[] args){
         int[]arr = {1,2,3};
        List<Integer> prem = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        subset(0,arr,prem,ans);

        for(int i = 0; i < ans.size(); i++) {
            for(int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void subset(int i, int[]arr,List<Integer> prem,List<List<Integer>> ans){
        if (i == arr.length){ // Base case
            ans.add(new ArrayList<Integer>(prem));
            return;
        }

        prem.add(arr[i]);

        subset(i + 1, arr,prem,ans);

        prem.remove(prem.size() - 1);

        subset(i + 1, arr,prem,ans);
    }
}
