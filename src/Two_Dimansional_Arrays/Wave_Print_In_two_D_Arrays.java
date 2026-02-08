package Two_Dimansional_Arrays;
public class Wave_Print_In_two_D_Arrays {
    public static void print (int[][]arr){
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args){
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        int m = arr.length, n = arr[0].length;
        // wave print --> row wise printing(alternate)
        for (int i = 0; i < m; i++) {
            if (i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
