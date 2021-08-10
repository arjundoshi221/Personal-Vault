#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    float ax,ay,bx,by,midPointx,midPointy;
    double distance;

    printf("Input coodinates of point A: \n");
    scanf("%f %f", &ax,&ay);
    printf("Input coodinates of point B: \n");
    scanf("%f %f", &bx,&by);
    
    midPointx = (ax+bx)/2;
    midPointy = (ay+by)/2;

    distance = sqrt( pow((bx-ax), 2) + pow((by-ay), 2) );
    printf("Distance between A and B: %.2f\n",distance);
    printf("Midpoint of line AB: (%.2f,%.2f)",midPointx,midPointy);
    
    return 0;
}