#include <stdio.h>

struct student
{
    char name[25];
    char grade[2];
    int Roll_No;
    float percentage;
};

int main()
{
    struct student s[5];
    int i;
    for (i = 0; i < 5; i++)
    {
        printf("\n Enter your Name : ");
        scanf("%s", s[i].name);
    }

    for (i = 0; i < 5; i++)
    {
        printf("\n Enter your Grade : ");
        scanf("%s", &s[i].grade);
    }

    s[0].Roll_No = 101;
    for (i = 0; i < 1; i++)
    {
        printf("\n Name : %s", s[i].name);
        printf("\n Grade: %s", s[i].grade);
        printf("\n Roll No: %d", s[i].Roll_No);
    }
    return 0;
}