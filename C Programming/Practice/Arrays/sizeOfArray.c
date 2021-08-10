#include <stdio.h>

int main()
{
    int a[] = {1,2,3,4,5,6,7,8,9,10};

    int lengthOfArray = sizeof(a)/sizeof(a[0]); // 40/4 
    //10 elements of 4 bytes divided by 1 element of 4 bytes
    
    printf("%d",lengthOfArray);
    return 0;
}
