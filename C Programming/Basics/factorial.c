#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    printf("Enter number: ");
    int n,fact=1;
    scanf("%d",&n);

    for(int i = 1; i <= n; i++)
    {
        fact = fact * i;
    }

    printf("\nFactorial of %d: %d",n,fact);

    return 0;
}