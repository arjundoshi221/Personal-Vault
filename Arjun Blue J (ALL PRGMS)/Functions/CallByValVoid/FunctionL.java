package Functions.CallByValVoid;
public class FunctionL
{
    public static void main()
    {
        for(int i=1;i<=1000;i++)
        {
            neon(i);
        }
    }
    public static void neon(int a)
    {
        int m=a;int s =0;int n=a*a;
        do
        {
            int d=n%10;
            n=n/10;
            s=s+d;
        }while(n!=0);
        if(s==m)
        {
            System.out.println(s);
        }
    }
}
