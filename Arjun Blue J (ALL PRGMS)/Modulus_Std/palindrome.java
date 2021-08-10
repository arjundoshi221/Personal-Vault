package Modulus_Std;
public class palindrome
{
    public static void main (int n)
    {
        int s=0,m=n;
        do
        {
            int d=n%10;
            n=n/10;
            s=(s*10)+d;
        }while(n!=0);
        if(s==m)
        {
            System.out.println("Palindrome");
        }    
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
