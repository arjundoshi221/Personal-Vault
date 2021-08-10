package Functions.CallByValVoid;
public class FunctionK
{
    public static void main(int n)
    {
        armstrong(n);
    }
    public static void armstrong(int n)
    {
        int m=n;int s=0;
        do
        {
            int d=n%10;
            n=n/10;
            s=s+(d*d*d);
        }while(n!=0);
        if(s==m)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("NOT Armstrong");
        }
    }
}
