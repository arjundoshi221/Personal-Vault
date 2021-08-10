package Functions;
public class A
{
    public static void main()
    {
        for(int t=1;t<=10;t++)
        {
            if(t<=3)
            {
                production((int)t);
            }
            if(t>3)
            {
                production((double)t);
            }
        }
    }
    public static void production(int t)
    {
        double P = 5+3*t;
        System.out.println(t+"\t:"+P);
    }
    public static void production(double t)
    {
        double P = 14 + Math.pow((t-5.0/2),2);
        System.out.println(t+"\t : "+P);
    }
}
