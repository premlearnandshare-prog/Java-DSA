package Binary_Serarch;

public class Linnner_Search {
    public static void main(String[] args){
        int[]arr = {4,6,5,3,3,6,4};  // Unsorted array
        int n = arr.length;
        boolean flag = false;
        int target = 11;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) flag = true;

        }
        if (flag == true) System.out.println("found");
        else System.out.println("Not found");

    }
    // jab array sorted diya ho to ham linner search ka use nhi karte hai
    // binary search ka use karte h
}
