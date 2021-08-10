#include <stdio.h>

int row = 4, col = 4;

int sumOfRowElements(int mat[row][col]);
int sumOfColElements(int mat[row][col]);
int sumOfDiagonalElements(int mat[row][col]);
int transpose(int mat[row][col]);

int main(void)
{

    int row, col, length;
    /**printf("Enter dimensions of Matrix:\n");
    printf("Rows: ");
    scanf("%d", &row);
    printf("Coloumns: ");
    scanf("%d", &col);*/

    int i, j, mat[row][col];
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            printf("\n mat[%d][%d] : ", i, j);
            scanf("%d", &mat[i][j]);
        }
    }

    int n;
    printf("\tTask to perform:\n1. Sum of elements of each row.\n2. Sum of elements of each coloumn .\n3. Sum of diagonal elements .\n4. Finding transpose of matrix.\n5. Exit");
    scanf("%d", &n);

    switch (n)
    {
    case 1:
        sumOfRowElements(mat);
        //sumOfRowElements(row, col, mat); //if you define mat in input but independent before dependent
        //sumOfRowElements(row, col); //if you define mat inside
        break;

    case 2:
        sumOfColElements(mat);
        break;

    case 3:;
        sumOfDiagonalElements(mat);
        break;

    case 4:
        transpose(mat);
        break;

    case 5:
        //test(mat);
        break;

    default:
        printf("Incorrect Input:\n");
        scanf("%d", &n);
    }
}

int sumOfRowElements(int mat[row][col])
{

    int sum = 0;
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            sum += mat[i][j];
        }
        printf("Sum of row %d: %d\n", i + 1, sum);
        sum = 0;
    }
    return 0;
}

int sumOfColElements(int mat[row][col])
{
    int sum = 0;
    for (int j = 0; j < col; j++)
    {
        for (int i = 0; i < row; i++)
        {
            sum += mat[i][j];
        }
        printf("Sum of coloumn %d: %d\n", j + 1, sum);
        sum = 0;
    }

    return 0;
}

int sumOfDiagonalElements(int mat[row][col])
{
    int sum = 0;
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            (i == j) ? (sum += mat[i][j]) : (sum = sum);
        }
    }
    printf("Sum of diagonal: %d\n", sum);
    return 0;
}

int transpose(int mat[row][col])
{
    int mat2[row][col];
    for (int a = 0; a < row; a++)
    {
        for (int b = 0; b < col; b++)
        {
            mat2[a][b] = mat[b][a];
        }
    }

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("%d\t", mat2[i][j]);
        }
        printf("\n");
    }

    //why do you get an error if you use the same matrix? solve
    return 0;
}
