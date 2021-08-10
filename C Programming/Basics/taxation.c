#include <stdio.h>
#include <stdlib.h>

int main()
{
    int income;
    int tax;

    printf("Input your income: \n");
    scanf("%d", &income);

    if(income<=250000)
    {
        tax = 0;
    }
    if( 250000 < income <= 500000)
    {
        tax = (0.05)*income;
    }
    if(500000 < income <= 1000000)
    {
        tax = (0.05)*500000 + (0.2)*(income - 500000);
    }
    if(1000000 < income)
    {
        tax = (0.05)*500000 + (0.2)*(500000) + (0.3)* (income - 1000000);
    }

    printf("Total payable tax: %d" , tax);

    return 0;
}

/**
 * Income Slab	Tax Rate
 * Up to Rs.2,50,000	        No Tax
 * Rs.2,50,000 - Rs.5,00,000	5%
 * Rs.5,00,000 - Rs.10,00,000	20%
 * Rs.10,00,000 and beyond	    30%
 * 
 */
