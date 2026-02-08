package Prem_Prectice_Sorting;

public class check_If_Array_Sorted {
    public static void main(String[] args){
         int[]arr = {3,4,6,4,6,5,3};
         boolean flag = true;  // true --> sorted
         int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >arr[i +1]) {
                flag = false;
                break;  // false --> Unsorted
            }
        }
        if (flag == true) System.out.println("Sorted");
        else System.out.println("Unsorted");
    }
}
