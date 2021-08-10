#include <stdio.h>
void main() 
	
{
    char ch;
    printf("Enter a letter\n");
    ch=getchar();
    if(ch>='a'&& ch<='z')
    {
        printf("Entered letter is lower case\n");
        ch=ch-32;
        printf("In upper case:\n");
        putchar(ch);
    }
    else if(ch>='A'&&ch<='Z')
    {
        printf("Entered letter is upper case\n");
        ch=ch+32;
        printf("In lower case:\n");
        putchar(ch);
    }
    else
    {
        printf("Enter valid letter");
    }
}
