package Two_Dimansional_Arrays;
public class Score_After_Flipping_Matrix {
    public static void main(String[] args){
         int [][] arr = {{0,0,1,1},
                         {1,0,1,0},
                         {1,1,0,0}
         };
         int m = arr.length;
         int n = arr[0].length;
        //put 1 at the 0th position if every row
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0){// flip the row
                for (int j = 0; j < n; j++) {
//                    // Method 1 for flip
//                    if (arr[i][j] == 0){
//                        arr[i][j] = 1;
//                    }
//                    else {// arr[i][j] == 1
//                        arr[i][j] = 0;
//                    }
                    // method 2 for flip
                    arr[i][j] = 1- arr[i][j];

                }

            }
            
        }
        //flip those cols whare(no of 0s > no iof 1s)
        // traveling in cols
        // j = 1 se start hoga kyuki sabhi row ke pahle cols me 1 put kiya hai
        for (int j = 1; j < n; j++) {
            int no_Of_Zeros = 0,no_Of_Ones = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0){
                    no_Of_Zeros++;
                }
                else {
                    no_Of_Ones++;
                }
            }
            if (no_Of_Zeros > no_Of_Ones){
                for (int i = 0; i < m; i++) {
//                    // flip
//                    if (arr[i][j] == 0){
//                        arr[i][j] = 1;
//                    }
//                    else {// arr[i][j] == 1
//                        arr[i][j] = 0;
//                    }
                    // method 2 for flipping
                    arr[i][j] = 1- arr[i][j];

                }
            }
            
        }
        int score = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int value = (int) (arr[i][j]  * Math.pow(2,n-j-1));

                score += value;
            }
        }
        System.out.println(score);
    }
}
