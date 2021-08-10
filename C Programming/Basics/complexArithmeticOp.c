#include <stdio.h>
void add(int[], int[]);
void sub(int[], int[]);
void pro(int[], int[]);

int main()
{
    int a[2], b[2];
    printf("Please enter the number in this format : real part followed by complex part");
    printf("\nEnter 1st complex number: \n");
    scanf("%d %d", &a[0], &a[1]);

    printf("\nEnter 2nd complex number: \n");
    scanf("%d %d", &b[0], &b[1]);

    int n;
    do
    {
        printf("\nSelect your choice : \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Exit\n");
        scanf("%d", &n);
        switch (n)
        {
        case 1:
            add(a, b);
            break;

        case 2:
            sub(a, b);
            break;

        case 3:
            pro(a, b);
            break;
        }

    } while (n != 4);

    return 0;
}

void add(int a[], int b[])
{
    int c[2];
    c[0] = a[0] + b[0];
    c[1] = a[1] + b[1];

    printf("Sum = %d + i(%d)\n", c[0], c[1]);
}

void sub(int a[], int b[])
{
    int c[2];
    c[0] = a[0] - b[0];
    c[1] = a[1] - b[1];

    printf("Subtraction = %d + i(%d)\n", c[0], c[1]);
}

void pro(int a[], int b[])
{
    int c[2];
    c[0] = a[0] * b[0] - a[1] * b[1];
    c[1] = a[0] * b[1] + a[1] * b[0];

    printf("Product = %d + i(%d)\n", c[0], c[1]);
}
