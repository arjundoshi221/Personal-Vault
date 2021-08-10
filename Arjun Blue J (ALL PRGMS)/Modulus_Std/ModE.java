package Modulus_Std;
public class ModE
{
    public static void main(int n)
    {
        int c =0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println(n+" is a prime number");
        }
        if(c!=2)
        {
            System.out.println(n+" is a NOT prime number");
        }
    }
}
