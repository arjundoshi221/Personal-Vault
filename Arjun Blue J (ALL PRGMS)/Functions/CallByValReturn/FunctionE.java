package Functions.CallByValReturn;
public class FunctionE
{
    public static boolean prime(int n)
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
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(int n)
    {
        System.out.println(prime(n));
    }
    public static void main()
    {
        int s=0;
        for(int i=1;i<=100;i++)
        {
            if(prime(i)==true)
            {
                System.out.print(i+ "  ");
                s=s+i;
            }
        }
        System.out.print("\nSOS= "+s);
    }
}
