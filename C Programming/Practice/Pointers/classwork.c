#include <stdio.h>
/*
float Area(float r, float *p)
{
    float area_c=3.1415*r*r;
    *p=2*3.1415*r;
    return area_c;
}
*/
void Area_2(float r, float *p, float *a)
{
    *a = 3.1415 * r * r;
    *p = 2 * 3.1415 * r;
    //return area_c;
}

int main()
{
    float radius = 0.0, peri;
    printf("\n Enter the Radius = ");
    scanf("%f", &radius);
    float area;
    Area_2(radius, &peri, &area);
    printf("\n Area = %f", area);
    printf("\n Perimeter = %f", peri);

    /*
    int radius=5;
    float area=10.5;

    int *ptr=&radius;
    printf("\n Radius = %d", *ptr);

    ptr=&area;
    printf("\n Area = %f", *ptr);

    void *new_ptr;

    new_ptr=&radius;
    printf("\n Radius = %d", *((int *)new_ptr));
    new_ptr=&area;
    printf("\n Area = %f", *((float *)new_ptr));
    */
    /*
    int *ptr=NULL;
    printf("\n Pointer ptr = %d", ptr);
    */

    /*
    int num;
    num=0;
    printf("\n Value in Num : %d",num);
    printf("\n Address of Num : %p",&num);

    //data_type *name;
    int *ptr=&num;
    //ptr=&num;
    printf("\n Pointers \n");
    printf("\n Value in Num : %d",*ptr);
    printf("\n Address of Num : %p",ptr);
    printf("\n Address of ptr : %p",&ptr);

    int *ptr2=NULL;
    //printf("\n Null Pointer Value = %d", *ptr2);
    printf("\n Address to which Null Pointer is pointing = %d", ptr2);
    printf("\n Null Pointer's Address = %p", &ptr2);
    */

    return 0;
}
