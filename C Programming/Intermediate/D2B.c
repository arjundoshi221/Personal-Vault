#include <stdio.h>
#include <math.h>
#include <stdlib.h>

#define D 10

int D2B()
{
    int i, n, k, vet[D];

    printf("FROM DECIMALS TO BINARIES\nEnter decimal: ");
    scanf("%d", &n);

    k = 0;

    while (n != 0)
    {
        if ((n % 2) == 1)
            vet[k] = 1;
        else
            vet[k] = 0;

        n /= 2;

        k++;
    }

    printf("Transformed into binary: ");

    for (i = k - 1; i >= 0; i--)
        printf("%d", vet[i]);

    printf("\n\n");

    system("pause");
}

#include <math.h>
#include <stdio.h>
int convert(long long n);
int B2D()
{
    long long n;
    printf("Enter a binary number: ");
    scanf("%lld", &n);
    printf("%lld in binary = %d in decimal", n, convert(n));
    return 0;
}

int convert(long long n)
{
    int dec = 0, i = 0, rem;
    while (n != 0)
    {
        rem = n % 10;
        n /= 10;
        dec += rem * pow(2, i);
        ++i;
    }
    return dec;
}

int main()
{
    D2B();
}