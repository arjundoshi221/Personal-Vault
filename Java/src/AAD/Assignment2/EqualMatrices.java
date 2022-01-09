import java.util.Scanner;

public class EqualMatrices {

    /*
     * 30. Write a program in C to accept two matrices and check whether they are
     * equal. Go to the editor
     * Test Data :
     * Input Rows and Columns of the 1st matrix :2 2
     * Input Rows and Columns of the 2nd matrix :2 2
     * Input elements in the first matrix :
     * element - [0],[0] : 1
     * element - [0],[1] : 2
     * element - [1],[0] : 3
     * element - [1],[1] : 4
     * Input elements in the second matrix :
     * element - [0],[0] : 1
     * element - [0],[1] : 2
     * element - [1],[0] : 3
     * element - [1],[1] : 4
     * Expected Output :
     * The first matrix is :
     * 1 2
     * 3 4
     * The second matrix is :
     * 1 2
     * 3 4
     * The Matrices can be compared :
     * Two matrices are equal.
     */
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

            int c = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] != B[i][j]) {
                        c++;
                    }
                }
            }

            if (c == 0)
                System.out.print("The Matrices can be compared :\nTwo matrices are equal.\n");
            else
                System.out.print("The Matrices can be compared :\nTwo matrices are NOT equal.\n");
        } else
            System.out.print("The Matrices cannot be compared ");
        sc.close();
    }

}
