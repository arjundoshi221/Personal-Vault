#include <stdio.h>
int main()
{
    printf("Enter number: \n");
    int a, rev = 0;
    scanf("%d", &a);

    while (a > 0)
    {
        int rem = a % 10;
        a = a / 10;
        rev = rev * 10 + rem;
    }
    printf("%d", rev);

    return 0;
}

/**int main()
{
    printf("Enter number: \n");
    int a, rev = 0;
    scanf("%d", &a);
    int copy = a;

    while (a > 0)
    {
        int rem = a % 10;
        a = a / 10;
        rev = rev * 10 + rem;
    }
    printf("%d", rev);

    if (copy == rev)
    {
        printf("\nPalindrome number");
    }
    else
    {
        printf("\nNOT Palindrome number");
    }

    return 0;
}*/
