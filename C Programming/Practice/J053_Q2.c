#include <stdio.h>
#include <string.h>

int check(char *str);

int main()
{
    char str[20];
    printf("Enter ticket code: ");
    gets(str);

    if (check(str))
    {
        printf("\nYES");
    }
    else
    {
        printf("\nNO");
    }
}

int check(char *str)
{
    if (strlen(str) < 2 || str[0] == str[1])
        return 0;

    char c = str[0];
    for (int i = 0; i < strlen(str); i += 2)
    {
        if (c != str[i])
        {
            return 0;
        }
    }
    c = str[1];
    for (int i = 1; i < strlen(str); i += 2)
    {
        if (c != str[i])
        {
            return 0;
        }
    }

    return 1;
}