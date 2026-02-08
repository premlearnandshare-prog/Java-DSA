package Two_Dimansional_Arrays;
public class Prectice {
    public static void print(int[][]arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
         int[][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         int m = arr.length;
         int n = arr[0].length;
         print(arr);
         int minr = 0, minc = 0;
         int maxr = m-1, maxc = n-1;
         // spiral print
        while (minr<=maxr && minc<=maxc) {
            // left to right
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;
            //Top to bottom
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;
            // Right to Left
            for (int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j] + " ");
            }
            maxr--;
            //bottom to top
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + " ");
            }
            minc++;
        }
    }
}
