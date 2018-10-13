import java.util.Scanner;

import static java.lang.System.exit;

public class MatrixMultiplication {
    public static void main(String[] args) {
        System.out.print("Enter no. of rows & columns for first matrix : ");

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] matrixA = new int[m][n];

        System.out.print("Enter values for first matrix : ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = in.nextInt();
            }
        }

        System.out.print("Enter no. of rows & columns for second matrix : ");

        int p = in.nextInt();
        int q = in.nextInt();

        if (n != p) {
            System.out.print("Could not create matrix for given values ");
            exit(0);
        }
        int[][] matrixB = new int[p][q];

        System.out.print("Enter values for second matrix : ");

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrixB[i][j] = in.nextInt();
            }
        }

        int[][] matrixC = new int[n][p];

        for (int i=0; i< m;i++){
            int sum = 0;
            for (int j=0; j< q;j++){
                for ( int k = 0 ; k < p ; k++ ) {
                    sum += matrixA[i][k] + matrixB[k][j];
                }
                matrixC[i][j] = sum;
            }
        }

        System.out.println("Multiplication of entered matrices:-");

        for ( int i = 0 ; i < m ; i++ )
        {
            for ( int j = 0 ; j < q ; j++ )
                System.out.print(matrixC[i][j]+"\t");

            System.out.print("\n");
        }
    }
}
