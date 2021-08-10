package Functions.CallByValVoid;
public class FunctionI
{
    public static void main()
    {
        for(int i=1;i<=10000;i++)
        {
            perfect(i);
        }
    }
    public static void perfect(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println(s);
        }
       
    }
}
