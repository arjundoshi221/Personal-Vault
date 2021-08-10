//No pointer
/**#include<stdio.h>
void swap_number(int temp1,int temp2);

void main()
{
    int a,b;
    printf("\nEnter two numbers: \n");
    scanf("Number 1: %d\n",&a);
    scanf("Number 2: %d\n",&b);
    swap_number(a,b);
}

void swap_number(int temp1,int temp2)
{
    temp1=temp1+temp2;
    temp2=temp1-temp2;
    temp1=temp1-temp2;

    printf("\nThe two swapped numbers are Number 1: %d, Number 2: %d",temp1,temp2);
}*/


// Pointer
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
    swap_number(&a,&b);//same as swap_number(pa,pb);
    swap_number(pa,pb);
}

void swap_number(int *a,int *b)
{
    *a = *a + *b;
    *b = *a - *b;
    *a = *a - *b;

    printf("\nThe two swapped numbers are Number 1: %d, Number 2: %d",*a,*b);
}