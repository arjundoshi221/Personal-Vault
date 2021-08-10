#include <stdio.h>

int main(void)
{
    int srch, length, c = 0;

    printf("Enter number of digits:");
    scanf("%d", &length);
    int a[length];

    printf("\nEnter List of numbers:\n");
    for (int i = 0; i < length; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("Enter number to check: ");
    scanf("%d", &srch);

    for (int i = 0; i < length; i++)
    {
        if (a[i] == srch)
        {
            c++;
        }
    }

    if (c != 0)
        printf("%d is found %d times", srch, c);
    else
        printf("%d is not found ", srch);

    return 0;
}