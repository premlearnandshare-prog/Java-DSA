package Advance_Sorting;

public class kth_smallest_element_in_Array {
    static int ans;
    public static void swap(int[]arr,int i,  int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[]arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[]arr = {4,9,1,2,6,5,8};
        int n = arr.length;
        print(arr);
        int k = 4;
        ans = -1;
        Quickselect(arr, 0,n - 1,k);
        System.out.println(ans);
    }
    public static void Quickselect(int[]arr,int start, int end, int k){
        if (start >= end) return; // Base case

        int pivot_index = partition(arr,start, end);

        if (pivot_index == k - 1){
            ans = arr[pivot_index];
            return;
        }
        // recursion magic
        // Left
       if (k - 1 < pivot_index) Quickselect(arr,start,pivot_index - 1, k);
        // right
       else Quickselect(arr,pivot_index + 1,end,k);

    }
    public static int partition(int[]arr,int start,int end){
        int pos = start;
        for(int i = start ; i <= end ; i++ ){
            if(arr[i] <= arr[end]){
                // swap(arr[i] and arr[pos])
                swap(arr,i,pos);
                pos++;
            }

        }
        return pos - 1;
    }
}