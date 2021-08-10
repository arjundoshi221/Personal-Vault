#include <stdio.h>

int fibonacci(int);
int sumOfFib(int);

int main()
{
    int n;
    printf("Enter number of elements \n");
    scanf("%d", &n);
    int sum = sumOfFib(n);
    printf("Fibonacci Series: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", fibonacci(i));
    }
    printf("\nSum: %d", sum);
}

int fibonacci(int n)
{
    if (n == 0)
    {
        return 0;
    }
    else if (n == 1)
    {
        return 1;
    }
    else
    {
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}

int sumOfFib(int n)
{
    if (n == 0)
    {
        return 0;
    }
    return fibonacci(n - 1) + sumOfFib(n - 1);
}