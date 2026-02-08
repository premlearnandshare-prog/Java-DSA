package Two_Dimansional_Arrays;
public class For_Each_Loop {
    public static void main(String[] args){
//        //1D Array
//         int[]arr = {4,4,5,2,6,8};
//         for(int ele: arr){
//         System.out.print(ele + " ");
//         }
//         System.out.println();
//         //2D Array
//        // 1 2 3
//        // 4 5 6
         int[][] a = {{1,2,3},{4,5,6}};
//        for (int i = 0; i < 2; i++) {// for rows
//            for (int j = 0; j<3; j++){// for column
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
        // method 1
//        for(int[] ele: a){
//        for (int x : ele){
//            System.out.print(x + " ");
//        }
//            System.out.println();
//        }
        // method 2
        for (int i = 0; i < a.length; i++) {
            for(int ele : a[i]){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
