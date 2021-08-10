// C program for the above approach
#include <stdio.h>
#include <string.h>

// Driver Code
int NewAccount()
{
    FILE *fp = fopen("Users.csv", "a+");

    char name[50], password[50], emailId[50];
    int accountno, amount;

    if (!fp)
    {
        // Error in file opening
        printf("Can't open file\n");
        return 0;
    }

    // Asking user input for the
    // new record to be added
    printf("\nEnter Account Holder Name\n");
    scanf("%s", &name);
    printf("\nEnter Account Number\n");
    scanf("%d", &accountno);
    printf("\nEnter Email Id\n");
    scanf("%s", &emailId);
    printf("\nEnter Password\n");
    scanf("%s", &password);

    // Saving data in file
    fprintf(fp, "%s, %d, %s, %s\n", name, accountno, emailId, password);

    printf("\nNew Account added to record");

    fclose(fp);
    return 0;
}