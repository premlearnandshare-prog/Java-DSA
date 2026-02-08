package Recursion;

public class Total_Number_Of_subset_In_Array {
    public static void main(String[] args){
         int[]arr = {1,2,3};  // --> total number of subset 2^n
         int n = arr.length;
        System.out.println(subset(2,n));
    }
    public static int subset(int a,int n){
        if (n == 0) return 1;
       int ans = a * subset(2,n - 1);
       return ans;
    }

    // {1,2,3} ==> { },{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}
    // 2 ^ 3 ==> 2 * 2 * 2 ==> 8
}
