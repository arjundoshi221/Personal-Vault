package Loop.Patterns;


/**
 */
public class PatternV
{
    public static void doPrint(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((i+j));
            }
            System.out.println();
        }
    }
}
