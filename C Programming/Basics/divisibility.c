#include <stdio.h>
void main() 
{
   int n;
   printf("Enter n\n");
   scanf("%d",&n);
   if(n%2==0 && n%3==0 && n%5!=0)
   {
      printf("%d is divisible by 2 and 3 and not by 5",n);
   }
   else
   {
      printf("Not divisible by 2 and 3 or divisible by 5");
   }
}

