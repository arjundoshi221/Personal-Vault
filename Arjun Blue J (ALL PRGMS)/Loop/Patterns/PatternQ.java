package Loop.Patterns;


public class PatternQ
{
    public static void doPrint(int n)
    {
        char ch='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(ch+i));
            }
            System.out.println();
        }
    }
}
