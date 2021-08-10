#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <windows.h>
int queue[5];
int front = -1;
int rear = -1;

int main();

void enqueue(int x)
{
    if (front == -1 && rear == -1)
    {
        rear = front = 0;
        queue[rear] = x;
    }
    else if ((rear + 1) % 5 == front)
    {
        printf("Overflow. Queue is full. ");
    }
    else
    {
        rear = (rear + 1) % 5;
        queue[rear] = x;
    }

    main();
}

void dequeue()
{
    if (front == -1 && rear == -1)
    {
        printf("Underflow. Queue is Empty");
    }
    else if (front == rear)
    {
        printf("Only one element is in the queue: %d", queue[rear]);
        front = rear = -1;
    }
    else
    {
        printf("The dequeued element is: %d", queue[front]);
        front = (front + 1) % 5;
    }

    main();
}

void display()
{
    if (front == -1 && rear == -1)
    {
        printf("Underflow. Queue is empty.");
    }
    else
    {
        int i;
        printf("Queue: ");
        while (i != rear)
        {
            printf("%d ", queue[i]);
            i = (i + 1) % 5;
        }
        printf("%d", queue[rear]);
    }

    main();
}
int main()
{
    int c, element;
    printf("\n1: Insert 2:Delete 3: Display 4: Quit");
    printf("\nEnter your choice: ");
    scanf("%d", &c);
    while (c < 5 && c != 0)
    {
        switch (c)
        {

        case 1:
            printf("Enter the element which is to be inserted");
            scanf("%d", &element);
            enqueue(element);
            break;

        case 2:
            dequeue();
            break;

        case 3:
            display();

        case 4:
            exit(0);

        default:
            printf("Enter Correct range.");
            main();
        }
    }
    return 0;
}