package Arrays_In_Java;
public class Two_Pointer_Reverse_The_Array {
    public static void main(String[] args){
        int[]arr = {10,20,30,40,50,60,70,80,90,100};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // Method 1  Solution Reverse
//        for (int i = 0; i < n/2; i++){
//            int j = (n)-1-i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        //Method 2
        //int i = 2,j = 5; // 2 se 5 tak change karna hai toh
        int i = 0,j = n-1; // Pure array ko change karna hai toh
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
            for (int ele : arr){
                System.out.print(ele + " ");
            }
        }

    }
}
