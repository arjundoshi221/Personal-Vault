#include<stdio.h>
void swap_number(int *a,int *b);

void main()
{
    int a,b;
    int *pa = &a ,*pb = &b;

    printf("\nEnter two numbers: \n");

    printf("Number 1: ");
    scanf("%d",&a);

    printf("Number 2: ");
    scanf("%d",&b);

    //Call by reference --> change in original main function values
    //swap_number1(&a,&b);//same as swap_number(pa,pb);
    swap_number1(pa,pb);

    //call by value --> no change in main function values
    swap_number2(a,b);
}

void swap_number1(int *a,int *b)
{
    *a = *a + *b;
    *b = *a - *b;
    *a = *a - *b;

    printf("\nThe two swapped numbers are Number 1: %d, Number 2: %d",*a,*b);
}

void swap_number2(int a,int b)
{
    a=a+b;
    a=a-b;
    a=a-b;

    printf("\nThe two swapped numbers are Number 1: %d, Number 2: %d",a,b);
}