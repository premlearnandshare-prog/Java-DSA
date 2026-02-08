package Arrays_In_Java;
import java.util.Arrays;
public class Sort_Array_using_builtin_Methods {
    // sort --> ascending order me jamana
    public static void Print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 58, 455, 7, 544, 4151, 7, 5, 8, 51, 445, 1, 4, 15,};
    Print(arr);
    Arrays.sort(arr);
    Print(arr);
    }
}
