package Functions.CallByValVoid;
public class FunctionB
{
    public static void main(int n)
    {
        series(n);
    }
    public static void series(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}