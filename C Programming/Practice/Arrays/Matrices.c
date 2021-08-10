#include <stdio.h>
/**
31. Write a program in C to check whether a given matrix is an identity matrix. Go to the editor
Test Data :
Input number of Rows for the matrix :3
Input number of Columns for the matrix :3
Input elements in the first matrix :
element - [0],[0] : 1
element - [0],[1] : 0
element - [0],[2] : 0
element - [1],[0] : 0
element - [1],[1] : 1
element - [1],[2] : 0
element - [2],[0] : 0
element - [2],[1] : 0
element - [2],[2] : 1
Expected Output :
The matrix is :
1 0 0
0 1 0
0 0 1
The matrix is an identity matrix.
*/

void mat1()
{
    /*------------------------ INPUT -----------------------------*/
    int row, col;
    printf("Enter dimensions of Matrix:\n");
    printf("Rows: ");
    scanf("%d", &row);
    printf("Coloumns: ");
    scanf("%d", &col);

    int mat[row][col];
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("\nElement - [%d],[%d] : ", i, j);
            scanf("%d", &mat[i][j]);
        }
    }

    /*------------------------ PRINT -----------------------------*/
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("%d\t", mat[i][j]);
        }
        printf("\n");
    }

    int temp = 0;
    for (int c = 1; c < row; c++)
    {
        if (mat[0][0] == 1)
        {
            if (mat[0][0] == mat[0 + c][0 + c])
                temp++;
        }
        else
            break;
    }

    if (temp == 2)
    {
        printf("The matrix is an identity matrix.\n");
    }
}

/*
30. Write a program in C to accept two matrices and check whether they are equal. Go to the editor
Test Data :
Input Rows and Columns of the 1st matrix :2 2
Input Rows and Columns of the 2nd matrix :2 2
Input elements in the first matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [1],[0] : 3
element - [1],[1] : 4
Input elements in the second matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [1],[0] : 3
element - [1],[1] : 4
Expected Output :
The first matrix is :
1 2
3 4
The second matrix is :
1 2
3 4
The Matrices can be compared :
Two matrices are equal.
*/
void mat2()
{
    int m, n, p, q;
    printf("Enter dimensions of Matrix 1:\n");
    printf("Rows: ");
    scanf("%d", &m);
    printf("Coloumns: ");
    scanf("%d", &n);

    printf("Enter dimensions of Matrix 2:\n");
    printf("Rows: ");
    scanf("%d", &p);
    printf("Coloumns: ");
    scanf("%d", &q);

    if (m == p && n == q)
    {
        /*---------------------- Input A & B ------------------------------*/
        printf("Enter Elements of Matrix A:\n");
        int A[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                printf("\n mat[%d][%d] : ", i, j);
                scanf("%d", &A[i][j]);
            }
        }

        printf("Enter Elements of Matrix B:\n");
        int B[p][q];
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < q; j++)
            {
                printf("\n mat[%d][%d] : ", i, j);
                scanf("%d", &B[i][j]);
            }
        }
        /*---------------------- printing A & B ------------------------------*/
        printf("Matrix A:\n");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < q; j++)
            {
                printf("%d\t", A[i][j]);
            }
            printf("\n");
        }

        printf("Matrix B:\n");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < q; j++)
            {
                printf("%d\t", B[i][j]);
            }
            printf("\n");
        }

        int c = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (A[i][j] != B[i][j])
                {
                    c++;
                }
            }
        }

        if (c == 0)
            printf("The Matrices can be compared :\nTwo matrices are equal.\n");
        else
            printf("The Matrices can be compared :\nTwo matrices are NOT equal.\n");
    }
    else
        printf("The Matrices cannot be compared ");
}

/**
 * MULTIPLICATION OF TWO MATRICES
 * Develop, implement and execute a C program that reads two matrices A (m x n ) and B (p x q ) and 
 * Compute the product A and B. Read matrix A and matrix B in row major order and in column major order 
 * respectively. Print both the input matrices and resultant matrix with suitable headings and output 
 * should be in matrix format only. Program must check the compatibility of orders of the matrices for 
 * multiplication. Report appropriate message in case of incompatibility.
 */

void mat3()
{
    int m, n, p, q;
    printf("Enter dimensions of Matrix 1:\n");
    printf("Rows: ");
    scanf("%d", &m);
    printf("Coloumns: ");
    scanf("%d", &n);

    printf("Enter dimensions of Matrix 2:\n");
    printf("Rows: ");
    scanf("%d", &p);
    printf("Coloumns: ");
    scanf("%d", &q);

    if (n == p)
    {
        /*---------------------- Input A & B ------------------------------*/
        printf("Enter Elements of Matrix A:\n");
        int A[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                printf("\n mat[%d][%d] : ", i, j);
                scanf("%d", &A[i][j]);
            }
        }

        printf("Enter Elements of Matrix B:\n");
        int B[p][q];
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < q; j++)
            {
                printf("\n mat[%d][%d] : ", i, j);
                scanf("%d", &B[i][j]);
            }
        }
        /*---------------------- printing A & B ------------------------------*/
        printf("Matrix A:\n");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < q; j++)
            {
                printf("%d\t", A[i][j]);
            }
            printf("\n");
        }

        printf("Matrix B:\n");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < q; j++)
            {
                printf("%d\t", B[i][j]);
            }
            printf("\n");
        }
        /*---------------------- Multiplication of A & B ------------------------------*/

        int sum = 0, p = 1;
        int X[m][q];
        int i, j, k, l;

        for (i = 0; i < m; i++) //outer loop            [A ith coloumns incrementation]
        {
            for (l = 0; l < q; l++) //middle loop       [B lth row incrementation]
            {
                for (j = 0; j < n; j++) //inner loop    [A jth row incrementation & B kth = jth coloumn incrementation  ]
                {
                    sum += (A[i][j] * B[j][l]);
                }
                X[i][l] = sum;
                sum = 0;
            }
        }

        /*---------------------- Printing of X = A*B ------------------------------*/

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < q; j++)
            {
                printf("%d\t", X[i][j]);
            }
            printf("\n");
        }
    }
}

/**.Write a function to find sum and average of upper diagonal elements in 2-dimensional matrix. 
Write a main program () to take number of rows, cols and values of matrix from the user.*/

void upperMat()
{
    /*------------------------ INPUT -----------------------------*/
    int row, col;
    printf("Enter dimensions of Matrix:\n");
    printf("Rows: ");
    scanf("%d", &row);
    printf("Coloumns: ");
    scanf("%d", &col);

    int mat[row][col];
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("\nElement - [%d],[%d] : ", i, j);
            scanf("%d", &mat[i][j]);
        }
    }

    int sum = 0;
    float c = 0.0;
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            if (i <= j)
            {
                sum = sum + mat[i][j];
                c++;
            }
        }
    }

    float avg = (sum / c);

    printf("Sum: %d\n", sum);
    printf("Average: %f\n", avg);
}

/**
28. Write a program in C to calculate determinant of a 3 x 3 matrix. Go to the editor
Test Data :
Input elements in the first matrix :
element - [0],[0] : 1
element - [0],[1] : 0
element - [0],[2] : -1
element - [1],[0] : 0
element - [1],[1] : 0
element - [1],[2] : 1
element - [2],[0] : -1
element - [2],[1] : -1
element - [2],[2] : 0
Expected Output :
The matrix is :
1   0   -1
0   0    1
-1  -1  0

The Determinant of the matrix is: 1
Click me to see the solution
*/

void mat4()
{
}

/**

*/

//MAIN FUNCTION
void main()
{
    mat2();
}