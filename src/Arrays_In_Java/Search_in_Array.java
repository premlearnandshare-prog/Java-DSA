package Arrays_In_Java;
import java.util.Scanner;
public class Search_in_Array {
    // Linner Search

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target: ");
        int x = sc.nextInt();
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int []arr = new int[n];
        n = arr.length;
        //Input Array
        System.out.println("Enter Array Element: ");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
//        //Method 1
//        for (int i = 0; i <n; i++) {
//            if (arr[i]==x) {
//               System.out.println("Found");
//               break;
//            }
//        }
        //Method 2
        boolean flag = false;
        for (int i = 0; i <n; i++) {
            if (arr[i]==x) {
               flag = true;//true means Found
                break;
            }
        }
        if (flag == true){
            System.out.println("Element Found");
        }
        else {
            System.out.println("Element not Found");
        }
    }
}
