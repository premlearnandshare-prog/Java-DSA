package Arrays_In_Java;
public class Sort_Array_Of_Zero_One_Two_Dutch_Flag_Algorithm_Colore_Sort {
    public static void main(String[] args){
        int[]arr = {0,1,2,0,1,2,1,2,0,2,1,2,0};
        int n = args.length;
        // method 1
//        int no_Of_Zeroes = 0;
//        int no_Of_Ones = 0;
//        int no_Of_Twos = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) no_Of_Zeroes++;
//            if (arr[i] == 1) no_Of_Ones++;
//            if (arr[i] == 2) no_Of_Twos++;
//        }
//        for (int i = 0; i < n; i++) {
//            if (i<no_Of_Zeroes) arr[i] = 0;
//             else if (i < no_Of_Zeroes + no_Of_Ones) arr[i] = 1;
//            else arr[i] = 2;
//        }
//       for(int ele: arr){
//       System.out.print(ele + " ");
//       }
//       System.out.println();
        //Method 2 ==> * Dutch Flag Algorithm *
        int mid = 0, hi = n-1,lo = 0;
          while(mid<=hi){
         if (arr[mid] == 0){
             swap(mid,lo);
             mid++;
             lo++;
         }
         else if (arr[mid] == 1) {
             mid ++;
         }
         else { //arr[mid] == 2
             swap(mid,hi);
             hi--;
         }


        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void swap(int mid, int lo) {
        int temp = mid;
        mid = lo;
        lo = temp;
    }

    private static void swap(int[]arr,int a,int b){
         int temp = a;
         a = b;
         b = temp;
    }

}
