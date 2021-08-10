#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,c;

    printf("Input length of 3 sides of the triangle: \n");
    scanf("%d %d %d", &a,&b,&c);

    if (a + b <= c || a + c <= b || b + c <= a)
    {
        printf("Triangle cannot be formed");
    } 
    else
    {
        if(a == b && b == c )
        {
            printf("Equilateral Triangle");
        }
        else if( a == b || b == c || c == a)
        {
            printf("Isosceles Triangle");
        }
        else 
        {
            printf("Scalene Triangle");
        }
    }
    
    return 0;
}