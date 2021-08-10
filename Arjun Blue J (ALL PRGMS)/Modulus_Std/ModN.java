package Modulus_Std;
public class ModN
{
    public static void main(int n)
    {
        int m=n;int s=0;
        
        do
        {
            int d=n%10;
            n=n/10;
            s=(s*10)+d;
        }while(n!=0);
        if(m==s)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("NOT Palindrome");
        }
    }
}
