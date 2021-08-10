#include <stdio.h>
#include <string.h>

int main()
{
    int N;
    printf("Enter number of students: ");
    scanf("%d", &N);
    char firstName[N][50], LastName[N][50];

    int checker[N];

    printf("\nEnter name of students:\n");

    for (int i = 0; i < N; i++)
    {
        checker[i] = 0;
        scanf("%s %s", firstName[i], LastName[i]);

        for (int j = 0; j < i; j++)
        {
            if (strcmp(firstName[i], firstName[j]) == 0)
            {
                checker[i] = 1;
                checker[j] = 1;
            }
        }
    }

    printf("\nAttendance call out:\n");
    for (int i = 0; i < N; i++)
    {
        if (checker[i] == 1)
        {
            printf("%s %s\n", firstName[i], LastName[i]);
        }
        else
            printf("%s\n", firstName[i]);
    }

    return 0;
}