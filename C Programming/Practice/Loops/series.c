#include <stdio.h>
#include <math.h>

/**
sum of the series [ 1-X^2/2!+X^4/4!- .........]. Go to the editor
Test Data :
Input the Value of x :2
Input the number of terms : 5
Expected Output :
the sum = -0.415873
Number of terms = 5
value of x = 2.000000
 */
int series1a(float x, int n)
{
    float sum, t, d;

    sum = 1;
    t = 1;
    for (int i = 1; i < n; i++)
    {
        d = (2 * i) * (2 * i - 1);
        t = -t * x * x / d;
        sum = sum + t;
    }
    printf("\nthe sum = %f\nNumber of terms = %d\nvalue of x = %.4f\n", sum, n, x);
    return 0;
}

int series1b(double x, int n)
{
    double sum = 1, term = 1, fct, m;
    int y = 2;

    // Sum of n-1 terms starting from 2nd term
    for (int i = 1; i < n; i++)
    {
        fct = 1;
        for (int j = 1; j <= y; j++)
        {
            fct = fct * j;
        }
        term = term * (-1);
        m = term * pow(x, y) / fct;
        sum = sum + m;
        y += 2;
    }

    printf("\nthe sum = %f\nNumber of terms = %d\nvalue of x = %.4f\n", sum, n, x);
    return 0;
}

/**
Write a program in C to display the sum of the series [ 1+x+x^2/2!+x^3/3!+....]. Go to the editor
Test Data :
Input the value of x :3
Input number of terms : 5
Expected Output :
The sum is : 16.375000
 */
int series2(double x, int n)
{
    double sum = 1, term = 1, fct, m;
    int y = 1;

    // Sum of n-1 terms starting from 2nd term
    for (int i = 1; i < n; i++)
    {
        fct = 1;
        for (int j = 1; j <= y; j++)
        {
            fct = fct * j;
        }

        m = term * pow(x, y) / fct;
        sum = sum + m;
        y += 1;
    }

    printf("\nthe sum = %f", sum);
    return 0;
}

/**
 * Write a program in C to find the sum of the series 1!/1+2!/2+3!/3+4!/4+5!/5 using the function
 */

void series10(double x, int n)
{
    int no = (int)x;
    double sum = 0;

    for (int i = 1; i <= no; i++)
    {
        int fct = 1;
        for (int j = 1; j <= i; j++)
        {
            fct = fct * j;
        }

        double term = fct / i;
        sum = sum + term;
    }

    printf("\nthe sum = %f", sum);
}

/**
Write a program in C to find the sum of the series [ x - x^3 + x^5 + ......]. Go to the editor
Test Data :
Input the value of x :2
Input number of terms : 5
Expected Output :
The values of the series:
2
-8
32
-128
512
The sum = 410
 */

int series3(double x, int n)
{
    double sum = 0, term = 1, m = 0;
    int y = 1;

    for (int i = 1; i <= n; i++)
    {
        m = term * pow(x, y);
        term = term * (-1);
        printf("%d\n", (int)m);
        sum = sum + m;
        y += 2;
    }

    printf("\nthe sum = %d\n", (int)sum);
    return 0;
}

/**
Write a program in C to find the sum of the series 1 +11 + 111 + 1111 + .. n terms. Go to the editor
Test Data :
Input the number of terms : 5
Expected Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
 */

int series4(double x, int n)
{
    int sum = 0, digit = 1;
    for (int i = 1; i <= n; i++)
    {
        printf("%d", digit);
        if (i >= 1 && i < n)
            printf(" + ");
        sum = sum + digit;
        digit = digit * 10 + 1;
    }

    printf("\nThe Sum is: %d", sum);
}

/**
Write a C program to check whether a given number is an armstrong number or not.

When the sum of the cube of the individual digits of a number is equal to that number, the number is called 
Armstrong number. 

For Example 153 is an Armstrong number because 153 = 1^3+5^3+3^3.

Test Data :
Input a number: 153
Expected Output :
153 is an Armstrong number.
 */
void ArmstrongNo(double x, int no)
{
    int n = (int)x, r = 0, sum = 0, copy = n;

    do
    {
        r = n % 10; // (153/10) --> remainder = 3
        n = n / 10; // (153/10) --> division = 15.3 = (int) 15
        sum = sum + (r * r * r);

    } while (n != 0);

    if (sum == copy)
        printf("%d is an Armstrong number.\n", copy);
    else
        printf("%d is not an Armstrong number.\n", copy);
}

void PrimeNo(double x, int n)
{
    int c = 0;
    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            c++;
        }
    }
    if (c == 2)
    {
        printf("%d is a prime number", n);
    }
    if (c != 2)
    {
        printf("%d is NOT a prime number", n);
    }
}

/** 34. Write a program in C to find the prime numbers within a range of numbers. Go to the editor
Test Data :
Input starting number of range: 1
Input ending number of range : 50
Expected Output :
The prime number between 1 and 50 are :
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
*/
int seriesPrimeNo(double x, int n)
{
    int stno = (int)x, enno = n;

    if (stno == 1)
    {
        printf("2 ");
        stno = 3;
    }

    if (stno % 2 == 0) //
    {
        stno++;
    }

    for (int num = stno; num <= enno; num = num + 2)
    {
        int ctr = 0;

        for (int i = 3; i <= num / 2; i++) //checks all odd numbers
        {
            if (num % i == 0)
            {
                ctr++;
                break;
            }
        }

        if (ctr == 0 && num != 1)
            printf("%d ", num);
    }

    return 0;
}
/**
35. Write a program in C to display the first n terms of Fibonacci series. Go to the editor
Fibonacci series 0 1 2 3 5 8 13 .....
Test Data :
Input number of terms to display : 10
Expected Output :
Here is the Fibonacci series upto to 10 terms :
0 1 1 2 3 5 8 13 21 34
*/

int fibonacci(double x, int n)
{
    int a = 0, b = 1;
    printf("%d ", a);
    printf("%d ", b);

    for (int i = 3; i <= n; i++) // for(int i=3;a+b<=20;i++)
    {
        int c = a + b;
        printf("%d ", c);
        a = b;
        b = c;
    }
}

/**43. Write a C program to find HCF (Highest Common Factor) of two numbers. Go to the editor
Test Data :
Input 1st number for HCF: 24
Input 2nd number for HCF: 28
Expected Output :
HCF of 24 and 28 is : 4


*/
int HCF(double x, int b)
{
    int a = (int)x;
    int c = 0;
    int hcf = 0;
    for (int i = 1; i <= a; i++)
    {
        if (a % i == 0 && b % i == 0)
        {
            c++;
            hcf = i;
        }
    }
    printf("HCF = %d", hcf);
}

/**44. Write a program in C to find LCM of any two numbers using HCF. Go to the editor
Test Data :
Input 1st number for LCM: 15
Input 2nd number for LCM: 20
Expected Output :
The LCM of 15 and 20 is : 60
*/
int LCM(double x, int b)
{
    int a = (int)x;
    int c = 0;
    int hcf = 0;

    for (int i = 1; i <= a; i++)
    {
        if (a % i == 0 && b % i == 0)
        {
            c++;
            hcf = i;
        }
    }
    int lcm = (a * b) / hcf;
    printf("LCM = %d", lcm);
}

/**
 * This function returns factorial of the number passed to it
 */

int factorialOf(int n)
{
    int factorial = 1;
    while (n > 0)
    {
        factorial *= n;
        n -= 1;
    }
    return factorial;
}

/**
45. Write a program in C to find LCM of any two numbers. Go to the editor
Test Data :
Input 1st number for LCM: 15
Input 2nd number for LCM: 20
Expected Output :
The LCM of 15 and 20 is : 60
Click me to see the solution

46. Write a program in C to convert a binary number into a decimal number using math function. Go to the editor
Test Data :
Input the binary number :1010100
Expected Output :
The Binary Number : 1010100
The equivalent Decimal Number is : 84
Click me to see the solution

56. Write a program in C to Check Whether a Number can be Express as Sum of Two Prime Numbers. Go to the editor
Test Data :
Input a positive integer: 16
Expected Output :
16 = 3 + 13
16 = 5 + 11
Click me to see the solution

57. Write a program in C to print a string in reverse order. Go to the editor
Test Data :
Input a string to reverse : Welcome
Expected Output :
Reversed string is: emocleW
Click me to see the solution

58. Write a C program to find the length of a string without using the library function. Go to the editor
Test Data :
Input a string : welcome
Expected Output :
The string contains 7 number of characters.
So, the length of the string welcome is : 7
Click me to see the solution

*/

int main(void)
{
    float x;
    int n;
    printf("Input the Value of x :");
    scanf("%f", &x);
    printf("Input the number of terms :");
    scanf("%d", &n);

    seriesPrimeNo(x, n);
}
