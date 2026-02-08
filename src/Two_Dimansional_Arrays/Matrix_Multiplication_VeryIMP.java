package Two_Dimansional_Arrays;

public class Matrix_Multiplication_VeryIMP {
    public static void main(String[] args){
        int[][] a = {{2,4,5},
                {6,5,3}   // 2*3  --> m * n
        };
        int[][] b = {{2, 4},
                {6, 5},
                {4, 3}     // 3*2 --> p * q
        };

        // condition ==> n == p
        // result -->    m * q

        int m = a.length;
        int n = b[0].length;
        int[][] c = new int[m][n];

        // traveling in c matrix
        if (a[0].length != b.length){
            System.out.println("Multiplication not possible");
        }

        else { // Multiplication is possible
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // Observation
                    // 2*2 + 4*6 + 5*4
                    // a[0][0]*b[0][0] + a[0][1]*b[1][0] +  a[0][2]*b[2][0] ....
                    // a[i][0]*b[0][j] + a[i][1]*b[1][j] +  a[i][2]*b[2][j] ....

                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }

                }

            }

            // Print
            print(a);
            print(b);
            print(c);
        }

    }
    public static void print(int[][] arr){
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
}

