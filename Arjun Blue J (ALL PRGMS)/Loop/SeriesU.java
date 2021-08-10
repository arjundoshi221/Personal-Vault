package Loop;
public class SeriesU
{
    public static void main(int n)
    {
        int s=0, t=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(t);
            s= s+t;
            t=t*10+1;
        }
        System.out.println("Sum = "+s);
    }    
}


