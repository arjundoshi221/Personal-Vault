package Functions;
public class A_Type2_return
{
    public static void main()
    {
        double x=0;
        for(int t=1;t<=10;t++)
        {
            if(t<=3)
            {
                x=production(t);
            }
            if(t>3)
            {
                x=production((double)t);
            }
            System.out.println(t+"\t:"+x);
        }
    }
    public static double production(int t)
    {
        double P = 5+3*t;
        return P;
    }
    public static double production(double t)
    {
        double P = 14 + Math.pow((t-5/2),2);
        return P;
    }
}
