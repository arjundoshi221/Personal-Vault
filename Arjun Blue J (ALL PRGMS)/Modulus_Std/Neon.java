package Modulus_Std;
public class Neon
{
    public static void main (int n)
    {
        int m=n,s=0;
        n=n*n;
        do
        {
            int d=n%10;
            n=n/10;
            s=s+d;  
        }while(n!=0);
        if(s==m)
        {
            System.out.println("It is a neon number");
        }
        else
        {
            System.out.println("It is not a neon number");
        }
    }    
}
