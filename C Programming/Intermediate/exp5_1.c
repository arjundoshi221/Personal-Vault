#include<stdio.h>
void main()
{
    int n;
    printf("Enter n \n");
    scanf("%d", &n);
    if(n%2!=0)
    {
        printf("Weird");
    }
    else if(n>=2&&n<=5)
    {
        printf("Not Weird");
    }
    else if(n>=6&&n<=20)
    {
        printf("Weird");
    }
    else if(n>20&&n%2==0)
    {
        printf("Not weird");
    }
    else
    {
        printf("");
    }

}
