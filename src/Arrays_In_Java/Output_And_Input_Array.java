package Arrays_In_Java;
import java.util.Scanner;
public class Output_And_Input_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int[]arr = {5,5,7,54,5,6,98,75,2};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        System.out.print("Enter array length: ");
        int[]arr = new int[5];
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]);//default values
        }

        //input of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //output of the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }



    }
}
