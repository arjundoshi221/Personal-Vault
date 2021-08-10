#include <stdio.h>

/**
The pattern like :
*
**
***
****
 */
int pattern1(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}

/**
The pattern like :
1
2 3
4 5 6
7 8 9 10
 */
int pattern2(int n)
{
    int c = 1;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%d", c);
            c++;
        }
        printf("\n");
    }

    return 0;
}

/**
    1 
   2 3 
  4 5 6 
 7 8 9 10 
 */
int pattern3(int n)
{
    int c = 1;
    for (int i = 1; i <= n; i++)
    {
        for (int k = n; k >= i; k--)
        {
            printf(" ");
        }
        for (int j = 1; j <= i; j++)
        {
            printf("%d ", c);
            c++;
        }
        printf("\n");
    }

    return 0;
}

/**
Write a program in C to display the pattern like a diamond. Go to the editor

    *
   *** 
  *****
 *******
********* 
 *******
  *****
   ***
    * 

 */

int pattern4a(int n) //mine
{

    for (int i = 1; i <= n; i++)
    {
        for (int k = n - 1; k >= i; k--)
            printf(" ");
        for (int j = 1; j <= 2 * i - 1; j++)
            printf("*");

        printf("\n");
    }

    for (int i = n - 1; i > 0; i--)
    {
        for (int k = 1; k <= n - i; k++)
            printf(" ");
        for (int j = 1; j <= 2 * i - 1; j++)
            printf("*");

        printf("\n");
    }
}

int pattern4b(int n)
{
    for (int i = 0; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++)
            printf(" ");
        for (int j = 1; j <= 2 * i - 1; j++)
            printf("*");
        printf("\n");
    }

    for (int i = n - 1; i >= 1; i--)
    {
        for (int j = 1; j <= n - i; j++)
            printf(" ");
        for (int j = 1; j <= 2 * i - 1; j++)
            printf("*");
        printf("\n");
    }
    return 0;
}
/**
33. Write a C program to display Pascal's triangle. Go to the editor
 Test Data :
Input number of rows: 5
Expected Output :

        1
      1   1 
    1   2   1 
  1   3   3   1
1   4   6   4   1 

*/

int pattern5(int no_row)
{
    int c = 1;

    for (int i = 0; i < no_row; i++)
    {
        for (int k = no_row; k >= i; k--)
            printf("  ");
        for (int j = 0; j <= i; j++)
        {
            if (j == 0 || i == 0)
                c = 1;
            else
                c = c * (i - j + 1) / j;
            printf("% 4d", c);
        }
        printf("\n");
    }
    return 0;
}

/**
36. Write a program in C to display the such a pattern for n number of rows using a number which will start with the number 1 and the first and a last number of each row will be 1. Go to the editor

  1
 121
12321

*/
void pattern6a(int n) //mine
{
    for (int i = 1; i <= n; i++)
    {
        for (int k = n; k > i; k--)
        {
            printf(" ");
        }

        for (int j = 1; j <= i; j++)
        {
            printf("%d", j);
        }

        for (int l = i - 1; l >= 1; l--)
        {
            printf("%d", l);
        }
        printf("\n");
    }
}

void pattern6b(int n)
{
    int i, j;

    for (i = 0; i <= n; i++)
    {
        /* print blank spaces */
        for (j = 1; j <= n - i; j++)
            printf(" ");
        /* Display number in ascending order upto middle*/
        for (j = 1; j <= i; j++)
            printf("%d", j);

        /* Display  number in reverse order after middle */
        for (j = i - 1; j >= 1; j--)
            printf("%d", j);

        printf("\n");
    }
}

/**
40. Write a C Program to display the pattern like pyramid using the alphabet. Go to the editor

        A
      A B A 
    A B C B A
  A B C D C B A 

*/
void pattern7a(int n)
{
    char ch = 'A';
    for (int i = 1; i <= n; i++)
    {
        for (int k = n; k >= i; k--)
        {
            printf(" ");
        }
        for (int j = 1; j <= i; j++)
        {
            printf("%c", ch);
            ch++;
        }

        ch -= 2;
        for (int l = i - 1; l >= 1; l--)
        {
            printf("%c", ch);
            ch--;
        }
        ch = 'A';
        printf("\n");
    }
}

void pattern7b(int n)
{
    int i, j;
    char alph = 'A';
    int blk;
    int ctr = 1;

    //if(n>26)
    //printf("Input the number of Letters (less than 26) in the Pyramid : ");

    for (i = 1; i <= n; i++)
    {
        for (blk = 1; blk <= n - i; blk++)
            printf("  ");

        for (j = 0; j <= (ctr / 2); j++)
        {
            printf("%c ", alph++);
        }

        alph = alph - 2;

        for (j = 0; j < (ctr / 2); j++)
        {
            printf("%c ", alph--);
        }
        ctr = ctr + 2;
        alph = 'A';
        printf("\n");
    }
}

/**	
Write a C program to print the following pattern till n lines.
123456789
23456789
3456789
456789
56789
6789
789
89
9
*/

int pattern8(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = i; j <= n; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }
}

int main(void)
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    pattern8(n);
}
