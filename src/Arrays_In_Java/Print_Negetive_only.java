package Arrays_In_Java;
import java.util.Scanner;
public class Print_Negetive_only {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:  ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Array Element: ");
        //input
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        //Printing Negative Numbers
        for (int i = 0; i < n; i++) {
            if (arr[i]<0){
                System.out.print(arr[i] + " ");
            }
        }




    }
}
