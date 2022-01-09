
/**
 * MULTIPLICATION OF TWO MATRICES
 * Develop, implement and execute a C program that reads two matrices A (m x n )
 * and B (p x q ) and
 * Compute the product A and B. Read matrix A and matrix B in row major order
 * and in column major order
 * respectively. Print both the input matrices and resultant matrix with
 * suitable headings and output
 * should be in matrix format only. Program must check the compatibility of
 * orders of the matrices for
 * multiplication. Report appropriate message in case of incompatibility.
 */

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, p, q;
        System.out.print("Enter dimensions of Matrix 1:\n");
        System.out.print("Rows: ");
        m = sc.nextInt();
        System.out.print("Coloumns: ");
        n = sc.nextInt();

        System.out.print("Enter dimensions of Matrix 2:\n");
        System.out.print("Rows: ");
        p = sc.nextInt();
        System.out.print("Coloumns: ");
        q = sc.nextInt();

        if (m == p && n == q) {
            /*---------------------- Input A & B ------------------------------*/
            System.out.print("Enter Elements of Matrix A:\n");
            int A[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("\n mat[" + i + "][" + j + "] : ");
                    A[i][j] = sc.nextInt();
                }
            }

            System.out.print("Enter Elements of Matrix B:\n");
            int B[][] = new int[p][q];
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print("\n mat[" + i + "][" + j + "] : ");
                    B[i][j] = sc.nextInt();
                }
            }
            /*---------------------- printing A & B ------------------------------*/
            System.out.print("Matrix A:\n");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.print("Matrix B:\n");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(B[i][j] + "\t");
                }
                System.out.println();
            }

            /*---------------------- Multiplication of A & B ------------------------------*/

            int sum = 0;
            int X[][] = new int[m][q];
            int i, j, l;

            for (i = 0; i < m; i++) // outer loop [A ith coloumns incrementation]
            {
                for (l = 0; l < q; l++) // middle loop [B lth row incrementation]
                {
                    for (j = 0; j < n; j++) // inner loop [A jth row incrementation & B kth = jth coloumn incrementation
                                            // ]
                    {
                        sum += (A[i][j] * B[j][l]);
                    }
                    X[i][l] = sum;
                    sum = 0;
                }
            }

            /*---------------------- Printing of X = A*B ------------------------------*/

            System.out.print("Matrix X:\n");
            for (int a = 0; a < m; a++) {
                for (int b = 0; b < q; b++) {
                    System.out.print(X[a][b] + "\t");
                }
                System.out.println();
            }
        }
        sc.close();

    }

}