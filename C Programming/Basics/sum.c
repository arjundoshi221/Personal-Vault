#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    printf("Enter number: ");
    int n,sum;
    scanf("%d",&n);

    for(int i = 0; i <= n; i++)
    {
        sum = sum + i;
    }

    printf("\nTotal sum: %d",sum);

    return 0;
}