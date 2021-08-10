/**
Write a program in C to display the multiplication table of a given integer. Go to the editor
Test Data :
Input the number (Table to be calculated) : 15
Expected Output :
15 X 1 = 15
...
...
15 X 10 = 150
 */

#include <stdio.h>

int singleTable(int n)
{

    for (int i = 1; i <= 10; i++)
    {
        printf("%d x %d = %d\n", n, i, (n * i));
    }

    return 0;
}

int table(int n)
{
    int mult = 1;
    for (int i = 1; i <= 10; i++)
    {
        for (int j = 1; j <= 10; j++)
        {
            mult = (i * j);
            printf("%d\t", mult);
        }
        printf("\n");
    }

    return 0;
}

int main(void)
{
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);

    table(n);
}