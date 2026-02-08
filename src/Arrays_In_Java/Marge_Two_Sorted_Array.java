package Arrays_In_Java;
public class Marge_Two_Sorted_Array {
    public static void main(String[] args){
         int[] a = {11,33,42,71};
        int[] b = {26,54,69,81};
        int m = a.length;
        int n = b.length;
        int[]c = new int[m+n];
        for(int ele: c){
        System.out.print(ele + " ");
        }
        System.out.println();
        marge(c,a,b);
        for(int ele: c){
            System.out.print(ele + " ");
        }
    }
    public static void marge(int[] c,int[] a,int[] b){
        //merging
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0, k = 0;
        while (i<m && j<n){
            if (a[i]<=b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (i== a.length){
            while (j< b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (j== b.length){
            while (i< a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }
    }
}
