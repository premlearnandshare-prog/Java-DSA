package Arrays_In_Java;

public class Rotate_The_Array {
    public static void Reverse(int []arr,int i,int j){
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int k = 2;
        int[]arr = {10,20,30,40,50,60,70,80,90,100};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        k = k%n;
        Reverse(arr,0,n-k-1);
        Reverse(arr,n-k,n-1);
        Reverse(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
// Logic
//       0  1   2  3  4  5  6  7  8  9
// arr = 10,20,30,40,50,60,70,80,90,100
//       |______________________| |____|      k = 2
//               |   Reverse        |  Reverse
//       80,70,60,50,40,30,20,10,  100,90
//       |_______________________________|
//                 |  Reverse
//      90,100,10,20,30,40,50,60,70,80







