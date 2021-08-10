package Loop.Patterns;
public class PatternU
{
    /**
     * a
     * a l
     * a l
     * a l
     */
    public static void doPrint(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j%2==0)
                    System.out.print("a ");
                else
                {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
