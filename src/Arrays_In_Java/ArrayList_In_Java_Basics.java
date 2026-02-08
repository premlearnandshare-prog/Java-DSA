package Arrays_In_Java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_In_Java_Basics {
    public static void main(String[] args){
//        int[]arr = new int[6];
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);
        System.out.println(arr.get(2)); // arr[2] // 18
        arr.set(2,40); // arr[2] = 40;
        System.out.println(arr.get(2)); // 40
        System.out.println(arr); // [25, 21, 40, 5, 10]
        int n = arr.size(); // arr.length
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");// 25 21 40 5 10
        }
        System.out.println();
        for(int ele: arr){
        System.out.print(ele + " "); // 25 21 40 5 10
        }
        System.out.println();
        arr.add(1,100);
       for(int ele: arr){
       System.out.print(ele + " ");
       }
       System.out.println();// 25 100 21 40 5 10
        arr.remove(arr.size()-1);
        System.out.println(arr);// Last Element Remove ho gya hai [25, 100, 21, 40, 5]
        //Reverse the array
        int i = 0,j = arr.size()-1;
        while (i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j++;
        }
       // Collections.reverse(arr);
        System.out.println(arr);// ArrayList Reverse ho gyi  [5, 40, 21, 100, 25]
    }
}
