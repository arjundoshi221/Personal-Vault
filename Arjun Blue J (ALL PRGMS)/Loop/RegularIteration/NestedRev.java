package Loop.RegularIteration;
public class NestedRev
{
    /*
     * 1
     * 12
     * 123
     * 1234
     */
    public static void main(int n)
    {
        for(int i= 1; i<=n; i++)
        {
            for(int j=1;j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
     * 1
     * 22
     * 333
     * 4444
     */
    public static void main_2(int n)
    {
        for(int i= 1; i<=n; i++)
        {
            for(int j=1;j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    /**
     * 5
     * 54
     * 543
     * 5432
     * 54321
     */
    public static void main2(int n)
    {
        for(int i= n; i>=1; i--)
        {
            for(int j=n;j>=i; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /**
     * 5
     * 44
     * 333
     * 2222
     * 11111
     */
    public static void main2_2(int n)
    {
        for(int i= n; i>=1; i--)
        {
            for(int j=n;j>=i; j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
     /**
     * 4 3 2 1
     *  3 2 1
     *   2 1
     *    1
     */
    public static void main3(int n)
    {
        int sp=0;
        for(int i= n; i>=1; i--)
        
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            sp++;
        }
    }
    /**
     * 1 1 1 1  4 3 2 1
     * 2 2 2     4 3 2
     * 3 3        4 3
     * 4           4
     */
      public static void main4(int n)
    {
        int sp = 0;
        for(int i=1; i<=n; i++)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i; j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            sp++;
        }
    }
}
