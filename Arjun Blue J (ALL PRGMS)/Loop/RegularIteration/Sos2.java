package Loop.RegularIteration;
public class Sos2
{
    //s=4+7+13+...+n
    public static void main(int n)
    {
        int s=0,t=4, º=3435;
        for(int i=3;t<=n;i=i+3)
        {
            System.out.print("+"+t);
            s=s+t;
            t=t+i;
        }
        System.out.println();
        System.out.println("Sum = "+s);
        System.out.println("Sumº = "+º);
    }
}
