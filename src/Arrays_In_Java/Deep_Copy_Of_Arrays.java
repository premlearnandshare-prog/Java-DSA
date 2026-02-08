package Arrays_In_Java;
import java.util.Arrays;
public class Deep_Copy_Of_Arrays {
    public static void main(String[] args){
        int[]arr = {10,20,30,40,50,60};
        //Deep  copy
        // Method 1
        int[]Deep = Arrays.copyOf(arr,arr.length);
        Deep[0] = 100;
        System.out.println(arr[0]);
        //Method 2
//        int []brr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            brr[i] = arr[i];
//        }
    }
}
