//Fibonacci
#include <stdio.h>
#include <stdio.h>

int fibonacci(int);
int sumOfFib(int);

int main()
{
    int n;
    printf("Enter number of elements \n");
    scanf("%d", &n);
    int sum = sumOfFib(n);
    printf("Fibonacci Series: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", fibonacci(i));
    }
    printf("\nSum: %d", sum);
}

int fibonacci(int n)
{
    if (n == 0)
        return 0;
    else if (n == 1)
        return 1;
    else
        return (fibonacci(n - 1) + fibonacci(n - 2));
}

int sumOfFib(int n)
{
    if (n == 0)
    {
        return 0;
    }
    return fibonacci(n - 1) + sumOfFib(n - 1);
}
//2D ARRAY
#include <stdio.h>
#include <stdlib.h>

void inp()
{
    printf("Enter number of rows 'm' :");
    int m, n;
    scanf("%d", &m);
    printf("\nEnter number of columns 'n' :");
    scanf("%d", &n);
    int arr[m][n];
    printf("\nNow enter elements\n");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("\nEnter element [%d] [%d] ", i + 1, j + 1);
            scanf("%d", &arr[i][j]);
        }
    }
    printf("\nOutput :\n");
    return ou(m, n, arr);
}
void ou(int m, int n, int arr[m][n])
{
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d\t", arr[i][j]);
        }
        printf("\n");
    }
    return sum(m, n, arr);
}
void sum(int m, int n, int arr[m][n])
{
    for (int i = 0; i < m; i++)
    {
        int sum = 0;
        for (int j = 0; j < n; j++)
        {
            sum += arr[i][j];
        }
        printf("\nSum of row %d = %d", i + 1, sum);
    }
}
void main()
{
    inp();
}

//2D SECOND METHOD
#include <stdio.h>
int m, n;
int mat[m][n];
void input()
{
    int *m = &m, *n = &n;
    printf("Enter M and N: \n");
    scanf("%d %d", &*m, &*n);
    int *mat[*m][*n] = &mat;
    printf("Enter elements of the array:\n");
    for (int i = 0; i < *m; i++)
    {
        for (int j = 0; j < *n; j++)
        {
            printf("Enter [%d][%d] element:\n", i + 1, j + 1);
            scanf("%d", &*mat[i][j]);
        }
    }
}
void entered()
{
    int *m = &m, *n = &n;
    printf("Entered array is \n");
    int *mat[*m][*n] = &mat;
    for (int i = 0; i < *m; i++)
    {
        for (int j = 0; j < *n; j++)
        {
            printf("%d", *mat[i][j]);
        }
        printf("\n");
    }
}
void add()
{
    int *m = &m, *n = &n;
    int *mat[*m][*n] = &mat;
    printf("Sum of 1st row is:\n");
    for (int i = 0; i < *m; i++)
    {
        sum = 0;
        for (int j = 0; j < *n; j++)
        {
            sum = sum + *mat[i][j];
        }
        printf("Sum of row %d is %d \n", i + 1, sum);
    }
}
void main()
{
    input();
    entered();
    add();
}

//MIKE
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    printf("Enter Code i.e. array of strings\n");
    char str[20], ch1, ch2, ch3;
    scanf("%s", &str);
    int ctr = 0, d = strlen(str);
    for (int i = 0; i < d; i++)
    {
        ch1 = str[i];
        ch2 = str[i + 1];
        ch3 = str[i + 2];
        if (ch1 != ch2 && ch1 == ch3)
        {
            ++ctr;
        }
    }
    int g = 5 / 2;
    if (ctr == d / 2 || ctr == 1 + d / 2)
    {
        printf("\nYES");
    }
    else
    {
        printf("\nNO");
    }
}

//reverse
#include <stdio.h>

void rev(int l, char *string)
{
    printf("%c", string[l]);

    if (l > 0)
        rev(l - 1, string);
}

int main()
{
    char str[25];
    gets(str);

    int len = strlen(str);

    rev(len, str);

    return 0;
}
//reverse second method
#include <stdio.h>
void reversestringrecursion();
int main()
{
    printf("Enter a sentence: ");
    reversestringrecursion();
    return 0;
}

void reversestringrecursion()
{
    char c;
    scanf("%c", &c);
    if (c != '\n')
    {
        reversestringrecursion();
        printf("%c", c);
    }
}
