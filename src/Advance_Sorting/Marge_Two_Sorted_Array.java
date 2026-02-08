package Advance_Sorting;

public class Marge_Two_Sorted_Array {
    public static void main(String[] args){
         int[] a = {1,3,4,7};
         int m = a.length;

        int[] b = {2,5,6,8};
        int n = b.length;

        int[] c = new int [m + n];
        int o = c.length;

        int i = 0, j = 0, k = 0;
        while (i < m && j < n){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++; k++;
            }
            else if (a[i] > b[j]){
                c[k] = b[j];
                j++; k++;
            }
            if (i == m && j < n){
                while (j < n){
                    c[k] = b[j];
                    j++; k++;
                }
            }
            if (j == n && i < m){
                while (i < m){
                    c[k] = a[i];
                    i++; k++;
                }
            }
        }
        for(int ele: c){
        System.out.print(ele + " ");
        }
        System.out.println();
    }
}
