package Loop.Patterns;
/**
 * 12345
 * 22345
 * 33345
 * 44445
 * 55555
 * 
 * 12345
 *  2345
 *   345
 *    45
 *     5
 * 
 *  12345
 * 2 2345
 * 33 345
 * 444 45
 * 5555 5
 */
public class PatternO
{
    public static void doPrint(int n)
    {
        int sp=0;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(i);
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            sp++;
        }
    }
    
    public static void main2(int n)
    {
        int sp=0;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(i);
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            sp++;
        }
    }
}
