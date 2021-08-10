package Loop.Patterns;


/**
 */
public class PatternR
{
    public static void doPrint(int n)
    {
        char ch='A';int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(ch+c));
                c++;
            }
            System.out.println();
        }
    }
}
