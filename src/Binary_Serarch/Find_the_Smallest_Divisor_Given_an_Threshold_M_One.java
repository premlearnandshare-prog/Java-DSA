package Binary_Serarch;

public class Find_the_Smallest_Divisor_Given_an_Threshold_M_One {
    public static void main(String[] args){
         // Leetcode 1283
        int[] arr = {5,1,9,2};
        int t = 6;
        int n = arr.length;
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            mx = Math.max(mx,arr[i]);
        }

        int d;
        for( d = 1; d <= mx; d++){
            int sum = 0;
            for(int i = 0; i<n; i++){
                if (arr[i]%d == 0)  sum += arr[i]/d;
                else sum += arr[i]/d + 1;
            }
            if (sum <= t) {
                System.out.println(d);
                break;
            }
        }

        System.out.println(d);
    }
}
