package Binary_Search_GFG_Prectice;

public class single_Among_Double_In_a_Sorted_Array {
    public static void main(String[] args){
         int[]arr = {1,1,2,2,3,3,4,5,5,6,6};
         int n = arr.length;
//         if (n == 1) return arr[0];
//         if (arr[0]!= arr[1]) return arr[0];
//         if (arr[n-1]!= arr[n-2]) return arr[n-1];
        int lo = 0, hi = n - 1;
        int single = -1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]){
                single = arr[mid];
                break;
            }
            int f = mid, s = mid;
            if (arr[mid] == arr[mid - 1]){
                f = mid -1;
            }
            else {  // arr[mid] != arr[mid - 1]
                s = mid + 1;
            }

            int leftcount = f - lo;
            int rightcount = hi - s;
            if (leftcount % 2 != 0) hi = f -1;
            else if (rightcount % 2 != 0) lo = s + 1;
        }
        System.out.println(single);
    }
}
