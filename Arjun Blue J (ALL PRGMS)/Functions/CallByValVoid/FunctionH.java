package Functions.CallByValVoid;
public class FunctionH
{
    public static void main(int n)
    {
        prime(n);
    }
    public static void prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is NOT a prime number");
        }
    }
}
