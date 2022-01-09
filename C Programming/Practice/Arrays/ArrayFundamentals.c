#include <stdio.h>

/**2. Write a program in C to read n number of values in an array and display it in reverse order. Go to the editor
Test Data :
Input the number of elements to store in the array :3
Input 3 number of elements in the array :
element - 0 : 2
element - 1 : 5
element - 2 : 7
Expected Output :
The values store into the array are :
2 5 7
The values store into the array in reverse are :
7 5 2*/
int array1(void)
{
    int length;
    printf("Enter number of digits:");
    scanf("%d", &length);
    int a[length];

    printf("\nEnter List of numbers:\n");
    for (int i = 0; i < length; i++)
    {
        scanf("%d", &a[i]);
    }

    for (int i = length - 1; i >= 0; i--)
    {
        printf("%d", a[i]);
    }
}
/**
 * Write a program to delete duplicate numbers from an array and count number of duplicates present.
 *
 * input 12233452
 * output:
 * 2 repeats itself 3 times.
 * 3 repeats itself 2 times.
 * 12345
 * 2 duplicates
 */
int array2()
{
    printf("Enter size of array:\n");
    int array_size, dup = 0;
    scanf("%d", &array_size);

    int arr1[array_size], temp[array_size];
    int c = 0; // temp array counter
    int reps = 0;

    printf("\nEnter array:\n");
    for (int i = 0; i < array_size; i++) // input loop
    {
        scanf("%d", &arr1[i]);
    }

    for (int i = 0; i < array_size; i++) // 1st array checker
    {
        int j;
        for (j = 0; j < c; j++)
        {
            if (temp[j] == arr1[i]) // checks similar
            {
                dup++;
                break;
            }
        }

        if (j == c) // when j reaches the maximum length i.e the end of the new array length. This adds
        // the value ai jth index in the right place
        {
            temp[c] = arr1[i]; // copies
            c++;
        }
    }

    for (int i = 0; i < c; i++) // reps counter loop
    {
        for (int j = 0; j < array_size; j++)
        {
            if (temp[i] == arr1[j])
            {
                reps += 1;
            }
        }

        if (reps > 1) // reps checker
        {
            printf("\n%d repeats itself %d times", temp[i], reps);
        }
        reps = 0;
    }

    printf("\n");
    for (int i = 0; i < c; i++)
        printf("%d ", temp[i]);
    printf("Number of repeated numbers: %d", dup);
    return 0;
}

/**6. Write a program in C to print all unique elements in an array. Go to the editor
Test Data :
Print all unique elements of an array:
------------------------------------------
Input the number of elements to be stored in the array: 4
Input 4 elements in the array :
element - 0 : 3
element - 1 : 2
element - 2 : 2
element - 3 : 5
Expected Output :
The unique elements found in the array are:
3 5
*/
int array3()
{
    int length;
    printf("Input the number of elements to be stored in the array:");
    scanf("%d", &length);
    int a[length];
    int u[length];
    int c = 0, counter = 0;

    printf("\nEnter List of numbers:\n");
    for (int i = 0; i < length; i++)
    {
        scanf("%d", &a[i]);
    }

    for (int i = 0; i < length; i++)
    {
        for (int j = 0; j < length; j++)
        {
            if (a[i] == a[j])
            {
                counter++;
            }
        }
        if (counter == 1)
        {
            u[c] = a[i];
            c++;
        }
        counter = 0;
    }

    printf("The unique elements found in the array are:: \n");
    for (int i = 0; i < c; i++)
    {
        printf("%d\t", u[i]);
    }

    return 0;
}

// Write a C program to find the minimum and maximum value from an array
int array4()
{
    int length;
    printf("Input the number of elements to be stored in the array:");
    scanf("%d", &length);
    int a[length];

    printf("\nEnter List of numbers:\n");
    for (int i = 0; i < length; i++)
    {
        scanf("%d", &a[i]);
    }

    int h = a[0], l = a[0];
    for (int i = 0; i < length; i++)
    {

        if (a[i] > h)
        {
            h = a[i];
        }
        if (a[i] < l)
        {
            l = a[i];
        }
    }
    printf("\nHighest no. = %d", h);
    printf("\nLowest no. = %d", l);
}

/**input 12233452
 * output:
 * 2 repeats itself 3 times.
 * 3 repeats itself 2 times
 *
 */

int array5()
{

    int i, j, k, Size;
    printf("\n Please Enter Number of elements in an array  :   ");
    scanf("%d", &Size);

    int arr[Size], original_array[Size];
    printf("\n Please Enter %d elements of an Array \n", Size);
    for (i = 0; i < Size; i++)
    {
        scanf("%d", &arr[i]);
        original_array[i] = arr[i];
    }

    int original_size;
    original_size = Size;

    for (i = 0; i < Size; i++) // 12233452
    {
        for (j = i + 1; j < Size; j++)
        {
            if (arr[i] == arr[j])
            {
                for (k = j; k < Size; k++)
                {
                    arr[k] = arr[k + 1];
                }
                Size--;
                j--;
            }
        }
    }

    // printf("\n Final Array after Deleteing Duplicate Array Elements is:\n");
    for (int i = 0; i < Size; i++)
    {
        // printf("%d\t", arr[i]);
        int count = 0;
        for (int j = 0; j < original_size; j++)
        {
            if (arr[i] == original_array[j])
            {
                count += 1;
            }
        }
        if (count > 1)
            printf("%d appears %d times\n", arr[i], count);
    }
    return 0;
}

/**There are n movies to watch during this weekend. Each movie can be
characterized by two integers Li and Ri, denoting the length and the rating
of the corresponding movie. Yash wants to watch exactly one movie with the
maximal value of Li × Ri. If there are several such movies, he would pick a
one with the maximal Ri among them. If there is still a tie, he would pick
the one with the minimal index among them.
*/

int array6()
{

    return 0;
}

/**
 * MULTIPLICATION OF TWO MATRICES
 * Develop, implement and execute a C program that reads two matrices A (m x n ) and B (p x q ) and
 * Compute the product A and B. Read matrix A and matrix B in row major order and in column major order
 * respectively. Print both the input matrices and resultant matrix with suitable headings and output
 * should be in matrix format only. Program must check the compatibility of orders of the matrices for
 * multiplication. Report appropriate message in case of incompatibility.
 */

void array2D7()
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

        for (i = 0; i < m; i++) // outer loop            [A ith coloumns incrementation]
        {
            for (l = 0; l < q; l++) // middle loop       [B lth row incrementation]
            {
                for (j = 0; j < n; j++) // inner loop    [A jth row incrementation & B kth = jth coloumn incrementation  ]
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

/*
Addition of two matrices
*/
void array8()
{
    int r, c, a[100][100], b[100][100], sum[100][100], i, j;
    printf("Enter the number of rows (between 1 and 100): ");
    scanf("%d", &r);
    printf("Enter the number of columns (between 1 and 100): ");
    scanf("%d", &c);

    printf("\nEnter elements of 1st matrix:\n");
    for (i = 0; i < r; ++i)
        for (j = 0; j < c; ++j)
        {
            printf("Enter element a%d%d: ", i + 1, j + 1);
            scanf("%d", &a[i][j]);
        }

    printf("Enter elements of 2nd matrix:\n");
    for (i = 0; i < r; ++i)
        for (j = 0; j < c; ++j)
        {
            printf("Enter element a%d%d: ", i + 1, j + 1);
            scanf("%d", &b[i][j]);
        }

    // adding two matrices
    for (i = 0; i < r; ++i)
        for (j = 0; j < c; ++j)
        {
            sum[i][j] = a[i][j] + b[i][j];
        }

    // printing the result
    printf("\nSum of two matrices: \n");
    for (i = 0; i < r; ++i)
        for (j = 0; j < c; ++j)
        {
            printf("%d   ", sum[i][j]);
            if (j == c - 1)
            {
                printf("\n\n");
            }
        }
}

/**
7. Write a program in C to merge two arrays of same size sorted in decending order. Go to the editor
Test Data :
Input the number of elements to be stored in the first array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Input the number of elements to be stored in the second array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Expected Output :
The merged array in decending order is :
3 3 2 2 1 1
*/
void array9() //(Selection sort) O(n^2)
{
    int m;
    printf("Input the number of elements to be stored in the first array :");
    scanf("%d", &m);
    int A[m];
    printf("Input %d elements in the array :\n", m);

    for (int i = 0; i < m; i++)
    {
        printf("element - %d : ", i);
        scanf("%d", &A[i]);
    }

    int n;
    printf("Input the number of elements to be stored in the first array :");
    scanf("%d", &n);
    int B[n];
    printf("Input %d elements in the array :\n", n);

    for (int i = 0; i < n; i++)
    {
        printf("element - %d : ", i);
        scanf("%d", &B[i]);
    }

    int x = m + n;
    int X[x];
    int c = 0;

    for (int i = 0; i < m; i++)
    {
        X[c] = A[i];
        c++;
    }
    for (int i = 0; i < n; i++)
    {
        X[c] = B[i];
        c++;
    }

    for (int i = 0; i < x - 1; i++)
    {
        for (int j = i + 1; j < x; j++)
        {
            if (X[i] < X[j]) // decending order
            {
                int temp = 0;
                temp = X[j];
                X[j] = X[i];
                X[i] = temp;
            }
        }
    }

    for (int i = 0; i < x; i++)
    {
        printf("%d ", X[i]);
    }
}

/**
8. Write a program in C to count the frequency of each element of an array. Go to the editor
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 25
element - 1 : 12
element - 2 : 43
Expected Output :
The frequency of all elements of an array :
25 occurs 1 times
12 occurs 1 times
43 occurs 1 times
*/

void array10()
{
    int m;
    printf("Input the number of elements to be stored in the first array :");
    scanf("%d", &m);
    int A[m];
    printf("Input %d elements in the array :\n", m);

    for (int i = 0; i < m; i++)
    {
        printf("element - %d : ", i);
        scanf("%d", &A[i]);
    }

    printf("The frequency of all elements of an array :\n");
    int c = 0;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (A[i] == A[j])
            {
                c++;
            }
        }

        printf("%d occurs %d times\n", A[i], c);
        c = 0;
    }
}

/**
13. Write a program in C to insert New value in the array (sorted list ).. Go to the editor
Test Data :
Input the size of array : 3
Input 3 elements in the array in ascending order:
element - 0 : 5
element - 1 : 7
element - 2 : 9
Input the value to be inserted : 8

Expected Output :
The exist array list is :
5 7 9
After Insert the list is :
5 7 8 9
*/

void array11()
{
    int m, n, no, pos;
    printf("Input the size of array :");
    scanf("%d", &n);
    m = n + 1;
    int A[m];
    printf("Input %d elements in the array :\n", m);

    for (int i = 0; i < n; i++)
    {
        printf("element - %d : ", i);
        scanf("%d", &A[i]);
    }

    printf("Input the value to be inserted : \n");
    scanf("%d", &no);

    // Determine the position where the new value will be insert.
    for (int i = 0; i < n; i++)
    {
        if (no < A[i])
        {
            pos = i;
            break;
        }
    }

    // move all data at right side of the array
    for (int i = m; i > pos; i--)
    {
        A[i] = A[i - 1];
    }

    // insert value at the proper position
    A[pos] = no;

    // print new array
    for (int i = 0; i < m; i++)
    {
        printf("%d ", A[i]);
    }
}
/**
15. Write a program in C to delete an element at desired position from an array. Go to the editor
Test Data :
Input the size of array : 5
Input 5 elements in the array in ascending order:
element - 0 : 1
element - 1 : 2
element - 2 : 3
element - 3 : 4
element - 4 : 5
Input the position where to delete: 3
Expected Output :
The new list is : 1 2 4 5
Click me to see the solution
*/

void array12()
{
    int m, pos;
    printf("Input the size of array : ");
    scanf("%d", &m);
    int A[m];
    printf("Input %d elements in the array :\n", m);

    for (int i = 0; i < m; i++)
    {
        printf("element - %d : ", i);
        scanf("%d", &A[i]);
    }

    printf("Input the position where to delete: ");
    scanf("%d", &pos);

    for (int i = pos - 1; i < m - 1; i++)
    {
        A[i] = A[i + 1];
    }

    for (int i = 0; i < m - 1; i++)
    {
        printf("%d ", A[i]);
    }
}

/**
16. Write a program in C to find the second largest element in an array. Go to the editor
Test Data :
Input the size of array : 5
Input 5 elements in the array :
element - 0 : 2
element - 1 : 9
element - 2 : 1
element - 3 : 4
element - 4 : 6
Expected Output :
The Second largest element in the array is : 6
*/

void array13()
{
    int m;
    printf("Input the size of array : ");
    scanf("%d", &m);
    int A[m];
    printf("Input %d elements in the array :\n", m);

    for (int i = 0; i < m; i++)
    {
        printf("element - %d : ", i);
        scanf("%d", &A[i]);
    }

    int l = A[0], l2 = A[0], s = A[0], s2 = A[0];
    int lpos, spos;

    // Sorting in ascending order
    for (int i = 0; i < m - 1; i++)
    {
        for (int j = i + 1; j < m; j++)
        {
            if (A[i] > A[j])
            {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }

    // finding out largest and smallest
    s = A[0];
    l = A[m - 1];
    /**for (int i = 0; i < m; i++)
    {
        if (l < A[i])
        {
            l = A[i];
        }
        if (s > A[i])
        {
            s = A[i];
        }
    }*/

    // finding out 2nd largest
    for (int i = m - 1; i >= 0; i--)
    {
        if (A[i] < l)
        {
            l2 = A[i];
            break;
        }
    }
    // and 2nd smallest
    for (int i = 0; i < m; i++)
    {
        if (A[i] > s)
        {
            s2 = A[i];
            break;
        }
    }
    printf("Second largest number: %d\n", l2);
    printf("Second smallest number: %d\n", s2);
}

// MAIN FUNCTION
void main()
{
    array2();
}