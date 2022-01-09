import java.util.Scanner;

public class UpperTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter dimensions of Matrix:\n");
        System.out.print("Rows: ");
        m = sc.nextInt();
        System.out.print("Coloumns: ");
        n = sc.nextInt();
        int A[][] = new int[m][n];

        if (m != n) {
            System.out.println("Matrix should be a square matrix");
            System.exit(0);
        } else {
            System.out.print("Enter Elements of Matrix A:\n");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("\n mat[" + i + "][" + j + "] : ");
                    A[i][j] = sc.nextInt();
                }
            }
        }

        System.out.println("Upper triangular matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j)
                    System.out.print("0 ");
                else
                    System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}