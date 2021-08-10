package Loop.Patterns;
public class PatternS
{
    /**
     * a
     * a 1 
     * a 2 a
     * a 3 a 4
     */
    public static void doPrint(int n)
    {
        int num=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j%2==0)
                    System.out.print("a ");
                else
                {
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
