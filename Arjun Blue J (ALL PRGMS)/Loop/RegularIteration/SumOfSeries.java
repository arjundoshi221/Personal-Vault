package Loop.RegularIteration;
public class SumOfSeries
{
    public static void doOddSeries(int n)
    {
        int s=0;
        for(int i=1;i<=n;i=i+2)
        {
            System.out.println(i);
            s=s+i;
        }
        //System.out.println(i);
        System.out.println("Sum = "+s);
    }
    public static void doEvenSeries(int n)
    {
        int s=0;
        for(int i=2;i<=n;i=i+2)
        {
            System.out.println(i);
            s=s+i;
        }
        System.out.println("Sum = "+s);
    }
    /**
     * s = 5 + 10 + 15 +20 +....+n
     */
    public static void doMultiplesOfFive(int n)
    {
        int s=0;
        for(int i=5;i<=n;i=i+5)
        {
            System.out.println(i);
            s=s+i;
        }
        System.out.println("Sum = "+s);
    }
    
    /**
     * s = 4 + 9 + 14 + 19 +...+n
     */
    public static void doMultiplesSeries1(int n)
    {
        int s=0;
        for(int i=4;i<=n;i=i+5)
        {
            System.out.println(i);
            s=s+i;
        }
        System.out.println("Sum = "+s);
    }
    /**
     * s = 2 + 8 + 14 + ...+n
     */
    public static void doMultiplesSeries2(int n)
    {
        int s=0;
        for(int i=2;i<=n;i=i+6)
        {
            System.out.println(i);
            s=s+i;
        }
        System.out.println("Sum = "+s);
    }
    /**
     * s = 2 - 4 + 6 - 8 ....+- n
     */
    public static void doMultiplesSeries3(int n)
    {
        int s=0;
        for(int i=2;i<=n;i=i+2)
        {
            if(i%4 ==0)
            {
                System.out.print(-i);
                s=s-i;
            }
            else
            {
                System.out.print("+"+i);
                s=s+i;
            }
        }
        System.out.println();
        System.out.println("Sum = "+s);
    }
        /**
     * s = 2 - 4 + 6 - 8 ....+- n
     */
    public static void doMultiplesSeries3_Method2(int n)
    {
        int s1=0;
        for(int i=2;i<=n;i=i+4)
        {
            System.out.println(i);
            s1=s1+i;
        }
        int s2=0;
        for(int i=4;i<=n;i=i+4)
        {
            System.out.println(i);
            s2=s2+i;
        }
        int s = s1-s2;
        System.out.println("Sum = "+s);
    }
    
    public static void doNaturalProducts(int n)
    {
        int s=1;
        for(int i=1;i<=n;i=i+1)
        {
            System.out.println(i);
            s=s*i;
        }
        //System.out.println(i);
        System.out.println("Product = "+s);
    }
    //1 + 11 + 111....
    public static void doNatural111(int n)
    {
        int s=0, t=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(t);
            s=s+t;
            t=t*10+1;
        }
        //System.out.println(i);
        System.out.println("sum = "+s);
    }
}

