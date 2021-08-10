package Loop.Patterns;
public class PatternH
{
    public static void main(int n)
    { 
        
        int c=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(c+" ");
                c=c+1;
            }
            System.out.println();
        }
    }
    /**
     * 1
     * 24
     * 357
     * 46810
     */
    public static void main3(int n)
    { 
        int c=1;
        for(int i=1; i<=n; i++)
        {
            c=i;
            for(int j =1; j<=i; j++)
            {
                
                System.out.print(c+" ");
                c=c+2;
            }
            System.out.println();
        }
    }
    /**
     * 4 4 4 4  1 2 3 4    4 3 2 1
     *  3 3 3    1 2 3      3 2 1
     *   2 2      1 2        2 1
     *    1        1          1
     * 
     */
    public static void main4(int n)
    { 
        int sp = 0;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            sp++;
        }
    }
     public static void main2(int n)
    { 
        
        int c=2;
        for(int i=1; i<=10; i++)
        {
            for(int j =1; j<=i; j++)
            {
                if(c>n)
                {
                    return;
                }
                System.out.print(c+" ");
                c=c+2;
            }
            System.out.println();
        }
    }
}
