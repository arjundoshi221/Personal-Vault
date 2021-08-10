#include <stdio.h>

int main(void)
{
    int inputSer[100];
    int inputNo;
    int len;
    int c; //counter

    printf("Input number to check: \n");
    scanf("%d", &inputNo);

    printf("Input length of sequence: \n");
    scanf("%d", &len);

    printf("Input sequence: \n");

    for (int i = 0; i < len; i++)
    {
        scanf("%d", &inputSer[i]);
    }

    for (int i = 1; i <= inputNo; i++)
    {
        for (int j = 0; j < len; j++)
        {
            if (inputSer[j] == i)
            {
                c++;
            }
        }

        if (c >= 2)
            printf("Duplicate %d :(%d) time's\n", i, c);
        if (c == 0)
            printf("%d is missing.\n", i);
        c = 0;
    }

    return 0;
}
