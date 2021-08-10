#include <stdio.h>

int main()
{
    int radius = 5;
    float area = 10.5;

    int *ptr = &radius;
    printf("\n Radius = %d", *ptr);

    ptr = &area;
    printf("\n Area = %f", *ptr);

    void *new_ptr;

    new_ptr = &radius;
    printf("\n Radius = %d", *((int *)new_ptr));
    new_ptr = &area;
    printf("\n Area = %f", *((float *)new_ptr));
}