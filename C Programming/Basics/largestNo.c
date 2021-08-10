#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,c;
    int tax;

    printf("Input three numbers: \n");
    scanf("%d %d %d", &a, &b, &c);

    int m = (a>b)?a:b;
    int maximum= (m>c)?m:c;
    if (a==b && a==c)
    {
        printf("All numbers are equal");
    }
    else
        printf("%d", maximum);

    return 0;

}