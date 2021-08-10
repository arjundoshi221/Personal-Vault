#include <stdio.h>
#include <string.h>

/*struct date
    {
        int day;
        int month;
        int year;
        //struct student s;
    };
*/
struct student
{
    char name[25];
    int roll_no;
    char grade[2];
    //struct date d;
};

int main()
{
    /*
    //struct student s;
    //struct student date d;
    d.day=01;
    d.month=04;
    d.year=1990;
    strcpy(d.s.name,"Krishna");
    d.s.grade='a';
    d.s.roll_no=101;

    printf("\n Name: %s", d.s.name);
    printf("\n Roll No: %d",d.s.roll_no);
    printf("\n Grade: %c", d.s.grade);
    printf("\n Date : %d / %d /%d ",d.day,d.month,d.year);
    */
    //struct student s1={"Sam",001,'A'};
    //printf("\n Name: %s \n Roll No: %d \n Grade: %c",s1.name,s1.roll_no,s1.grade);

    struct student s[3];
    //struct date d[10];
    char grade_check[2];
    int i;
    for (i = 0; i < 3; i++)
    {
        printf("\n Name : ");
        scanf("%s", s[i].name);
    }
    for (i = 0; i < 3; i++)
    {
        printf("\n Grade: ");
        scanf("%s", s[i].grade);
    }
    for (i = 0; i < 3; i++)
    {
        printf("\n Roll No: ");
        scanf("%d", &s[i].roll_no);
    }

    for (i = 0; i < 3; i++)
    {
        printf("\n Name: %s", s[i].name);
        printf("\n Roll No: %d", s[i].roll_no);
        printf("\n Grade: %s", s[i].grade);
    }

    printf("\n Enter the grade : ");
    scanf("%s", grade_check);
    for (i = 0; i < 3; i++)
    {
        int temp = strcmp(grade_check, s[i].grade);
        if (temp == 0)
        {
            printf("\n Name: %s", s[i].name);
            printf("\n Roll No: %d", s[i].roll_no);
            printf("\n Grade: %s", s[i].grade);
        }
        /*
        else
        {
            printf("\n Record cannot be Found !!! ");
        }*/
    }

    return 0;
}
