package Loop.Patterns;


public class PatternP
{
    public static void doPrint(int n)
    {
        char ch='A';
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(ch+j)+" ");
            }  
            System.out.println();
        }
    }
    
    public static void main(int n)
    {
        char ch ='A';
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(ch+j)+" ");
            }
            System.out.println();
        }
    }
}
