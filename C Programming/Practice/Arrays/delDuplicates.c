#include <stdio.h>

int main()
{
    printf("Enter size of array:\n");
    int array_size;
    scanf("%d", &array_size);

    int arr1[array_size], temp[array_size];
    int c = 0; //temp array counter

    printf("\nEnter array:\n");
    for (int i = 0; i < array_size; i++) //input loop
    {
        scanf("%d", &arr1[i]);
    }

    for (int i = 0; i < array_size; i++) //1st array checker
    {
        int j;
        for (j = 0; j < c; j++)
        {
            if (arr1[i] == temp[j]) //checks duplicate
            {
                break;
            }
        }
        if (j == c) //when j reaches the maximum length i.e the end of the new array length. This adds
        // the value ai jth index in the right place
        {
            temp[c] = arr1[i]; //copies
            c++;
        }
    }

    for (int i = 0; i < c; i++)
        printf("%d ", temp[i]);

    return 0;
}