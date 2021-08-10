#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void update(int *a,int *b) 
{
    *a=*a+*b;
    *b= abs(*a-(2**b));        
}

/**
void update(int *a,int *b) 
{
    int t1, t2;
    t1 = *a + *b;
    t2 = abs(*a - *b);
    *a = t1;
    *b = t2;
}
*/

int main() 
{
    int a, b;
    int *pa = &a, *pb = &b;
    
    printf("Enter 2 numbers: ");
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("Address of a: %d",pa);
    printf("Value of a: %d",*pa);
    printf("Address of pa: %d",&pa);
    //printf("%d\n%d", a, b);

    return 0;
}

