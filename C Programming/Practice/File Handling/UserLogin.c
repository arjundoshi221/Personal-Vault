#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <windows.h>

const char *getfield(char *line, int num);

int main()
{
    char *name[100];
    char *password[100];
    printf("\nENTER YOUR CREDENTIALS : \n");
    printf("\nENTER YOUR USERNAME : ");
    scanf("%s", name);
    printf("\nENTER YOUR PASSWORD : ");
    scanf("%s", password);
    char comma[50] = ",";
    const char *tp1[100];
    const char *tp2[100];

    strcpy(tp1, strcat(name, comma));
    strcpy(tp2, strcat(tp1, password));
    tp2[strlen(tp2)] = '\n';
    printf("%d", strlen(tp2));

    printf("%s", tp2);

    FILE *filePointer = fopen("UsersLogin.csv", "r");

    if (filePointer == NULL)
    {
        printf(" file failed to open.\n");
    }
    else
    {
        printf(" \nFile is now open.\n");
        printf("User Values tp2 %s\n", tp2);

        char buffer[1024];
        while (fgets(buffer, 1024, filePointer))
        {
            char *tmp = strdup(buffer);
            const char *usernamePassword[100];
            char *cpy;
            int n, i;

            strcpy(usernamePassword, getfield(tmp, 1));
            printf("\nDatabase values %s\n", usernamePassword);
            i = strlen(usernamePassword);
            cpy = (char *)malloc(i);
            strncpy(cpy, usernamePassword, i - 1);
            cpy[i - 2] = '\0';

            printf("\nusername %s\n", usernamePassword);
            printf("\nusername %d\n", strlen(usernamePassword));
            printf("cpy: %s\n", cpy);
            printf("cpy: %d\n", strlen(cpy));
            printf("tp2 %s\n", tp2);
            printf("tp2 %d\n", strlen(tp2));

            if ((n = strcmp(tp2, cpy)) == 0)
            {
                printf("\nHello");
            }

            free(cpy);
            free(tmp);
        }
    }
}

const char *getfield(char *line, int num)
{
    const char *tok;
    for (tok = strtok(line, ";");
         tok && *tok;
         tok = strtok(NULL, ";\n"))
    {
        if (!--num)
            return tok;
    }
    return NULL;
}