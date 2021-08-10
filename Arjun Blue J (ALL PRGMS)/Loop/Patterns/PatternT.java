package Loop.Patterns;
public class PatternT
{
    public static void doPrint(int n)
    {
        int num=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==1)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(num+" ");
                    num++;
                }
            }
            else
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("a ");
                }
            }
            System.out.println();
        }
    }
    public static void doPrint2(int n)
    {
        int num=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==1)
            {
                for(int j=1;j<=i+1;j++)
                {
                    System.out.print(j+" ");
                    num++;
                }
            }
            else
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("a ");
                }
            }
            System.out.println();
        }
    }
}
