#include <stdio.h>

float salary(int basic);

int main()
{
    char name[50];
    long long int phone;
    int age;
    int b_salary;
    int id;

    float tax;

    printf("Enter name:  ");
    gets(name);
    printf("Enter phone:  ");
    scanf("%lld", &phone);
    printf("Enter age:  ");
    scanf("%d", &age);
    printf("Enter basic salary:  ");
    scanf("%d", &b_salary);
    printf("Enter ID:  ");
    scanf("%d", &id);

    float tot = salary(b_salary);

    if (tot>=250000 && tot < 350000)
    {
        tax = .15*tot;
    }
    else if (tot>=350000 && tot < 500000)
    {
        tax = .2*tot;
    }
    else if (tot>=500000)
    {
        tax = .3*tot;
    }

    float final_sum = tot-tax;
    printf("Final Salary: %f\n", final_sum);
    printf("Total Taxation: %f\n",tax);

    return 0;
}

float salary(int basic)
{
    float DA = 0.4 * basic;
    printf("Dearness allowance: %f\n",DA);
    float rent_all = 0.2 * basic;
    printf("Rent allowance: %f\n",rent_all);

    float gross_sal = basic + DA + rent_all;
    return gross_sal;

}