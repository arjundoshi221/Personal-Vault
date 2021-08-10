package Loop.RegularIteration;
public class Series
{
    public static void doOddSeries(int n)
    {
        for(int i=1;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
    public static void doEvenSeries(int n)
    {
        for(int i=2;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
    public static void doMultiplesOfFive(int n)
    {
        for(int i=5;i<=n;i=i+5)
        {
            System.out.println(i);
        }
    }
}

