package Advance_Sorting;

public class ms {
    public static void print(int[]arr){
        // for each loop
         for(int ele: arr){
         System.out.print(ele + " ");
         }
         System.out.println();
    }
    public static void main(String[] args){
         int[]arr = {80,10,70,30,60,40,50,20};
         print(arr);
         margesort(arr);
         print(arr);
    }
    public static void margesort(int[]arr){
         int n = arr.length;
         if (n == 1) return;
         // step 1 create a and b array
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];

        // step 2 copy paste
        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n - n/2; i++) {
            b[i] = arr[i + n/2];
        }
        // step 3 magic
        margesort(a);
        margesort(b);
        // step 4 marge tpo sorted array
        marge(a,b,arr);
    }
    public static void marge(int[]a,int[]b,int[]c){
         int m = a.length;
         int n = b.length;
         int o = c.length;
         int i = 0,j = 0,k = 0;
         while (i < m && j < n){
             if(a[i] <= b[j]){
                 c[k] = a[i];
                 i++ ; k++;
             }
             else if(a[i] > b[j]){
                 c[k] = b[j];
                 j++ ; k++ ;
             }
             if(i >= m && j < n){
                 while(j < n){
                     c[k] = b[j];
                     j ++; k++;
                 }
             }
             if(i < m && j >= n){
                 while(i < m){
                     c[k] = a[i];
                     i++;k++;
                 }
             }
         }
    }
}
