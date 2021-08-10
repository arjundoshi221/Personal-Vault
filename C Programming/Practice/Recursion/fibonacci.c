#include <stdio.h>
void fibonacci(int n)
{
    static int a = 0, b = 1, c;
    if (n > 0)
    {
        c = a + b;
        a = b;
        b = c;
        printf("%d ", c);
        fibonacci(n - 1);
    }
}

int main(void)
{
    int n;
    printf("Input number of terms to display :  ");
    scanf("%d", &n);
    int a = 0, b = 1;
    printf("%d %d ", a, b);
    fibonacci(n - 2);
    return 0;
}