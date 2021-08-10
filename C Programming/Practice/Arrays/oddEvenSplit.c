#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    int evenCounter = 0, oddCounter = 0;
    printf("Enter lenght of series: \n");
    scanf("%d", &n);
    int s1[n];

    printf("Enter series of numbers: \n");

    for (int i = 0; i < n; i++) //input loop
    {
        scanf("%d", &s1[i]);
    }

    for (int i = 0; i < n; i++) //array definition loop for odd and even
    {
        if (s1[i] % 2 == 0)
        {
            evenCounter++;
        }
        else
        {
            oddCounter++;
        }
    }

    int odd[oddCounter];
    int even[evenCounter];

    int e = 0, o = 0; //allows each array to store idependently

    for (int i = 0; i < n; i++) //loop to build odd and even array
    {
        if (s1[i] % 2 == 0)
        {
            even[e] = s1[i];
            e++;
        }
        else
        {
            odd[o] = s1[i];
            o++;
        }
    }

    printf("\nThe odd series: \n"); //print loop
    for (int i = 0; i < o; i++)
    {
        printf("%d", odd[i]);
    }

    printf("\nThe even series: \n"); //print loop
    for (int i = 0; i < e; i++)
    {
        printf("%d", even[i]);
    }

    return 0;
}