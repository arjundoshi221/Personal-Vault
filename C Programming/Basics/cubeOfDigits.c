#include <stdio.h>
#include <math.h>

int main()
{
    printf("Enter number: \n");
    int a, sum = 0;
    scanf("%d", &a);

    while (a > 0)
    {
        int rem = a%10;
        a = a/10;
        sum += pow(rem, 3);
    }
    printf("%d", sum);

    return 0;
}
