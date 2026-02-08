package Advance_Sorting;

public class inversion_Method_one {
    static int count;
    public static void  Inversion(int[] a,int[] b){
         int i = 0, j = 0;
         while (i < a.length && j < b.length){
             if (a[i] > b[j]){
                 count += a.length - i;
                 j++;
             }
             else i++;
         }
    }
    public static void print(int[]arr){
         for(int ele: arr){
         System.out.print(ele + " ");
         }
         System.out.println();
    }
    public static void main(String[] args){
         int[]arr = {5,4,3,2,1};
         print(arr);
         margesort(arr);
         print(arr);
        System.out.println(count);
    }
    public static void margesort(int[]arr){
         int n = arr.length;
         if (n == 1) return; // Base case
         //step 1 create a and b n/2 size array
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];
        // copy paste
        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n - n/2; i++) {
            b[i] = arr[i + n/2];
        }
        // magic
        margesort(a);
        margesort(b);
        Inversion(a,b);
        // marge array
        marge(a,b,arr);
        a = null; b = null;
    }
    public static void marge(int[]a,int[]b,int[]c){
         int m = a.length;
         int n = b.length;
         int o = c.length;
         int i = 0,j = 0,k = 0;
         while (i < m && j < n){
             if (a[i] <= b[j]){
                 c[k] = a[i];
                 i++; k++;
             }
             else if (a[i] > b[j]){
                 c[k] = b[j];
                 j++;k++;
             }
             if (i >= m && j < n){
                 // print j
                 while (j < n){
                     c[k] = b[j];
                     j++; k++;
                 }
             }
             if (i < m && j >= n){
                while (i < m){
                    c[k] = a[i];
                    i++; k++;
                }
             }
         }
    }
}
