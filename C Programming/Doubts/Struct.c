#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct item
{
    char name[15];
    char code[15];
    float price;
    int stock;
    char gender;
};

int main()
{

    struct item cat;
    strcpy(cat.name, "Arjun");
    strcpy(cat.code, "M01");
    //cat.name = {'R', 'e', 'g'};
    //cat.code = {'M'};

    cat.price = 499.0;
    cat.stock = 20;
    cat.gender = 'm';

    //cat womens;

    //cat childrens;
}