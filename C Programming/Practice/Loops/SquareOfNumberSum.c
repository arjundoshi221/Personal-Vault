#include <stdio.h>
#include <math.h>
/**
 Task 4: Write a C program to find sum of squares of numbers entered by the user till user enters a negative number. 
 The program will not find sum of square of a number, if it is divisible by 3. (using do-while loop)

 eg:Input: 2 4 6 5 -1
    Output:45
 */
int main(void)
{
    int c = 0, sum = 0;
    int n[50], copy[50];
    printf("Enter Numbers: ");

    /** 
    for (int i = 0; i < 50; i++)
    {
        scanf("%d", &n[i]);

        if (n[i] < 0)
        {
            break;
        }

        if (n[i] > 0 && n[i] % 3 != 0)
        {
            copy[c] = pow(n[i], 2);
            printf("%d\n", copy[c]);
            c++;
        }
    }*/

    int i = 0;
    do
    {
        scanf("%d", &n[i]);
        if (n[i] < 0)
        {
            break;
        }

        if (n[i] > 0 && n[i] % 3 != 0)
        {
            copy[c] = pow(n[i], 2);
            //printf("%d\n", copy[c]);
            c++;
        }
        i++;
    } while (i < 50);

    for (int i = 0; i < c; i++)
    {
        sum += copy[i];
    }

    printf("Sum: %d\n", sum);

    return 0;
}
