package Loop.RegularIteration;
public class NL
{
    public static void doNestedLoop(int n)
    {
        /*
         * 1
         * 12
         * 123
         * 1234
         * :
         */
        for(int i=1; i<=n     ;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
     public static void doNestedLoop2(int n)
    {
        /*
         * 1
         * 12
         * 123
         * 1234
         * :
         */
        int num=1;
        for(int i=1; i<=n     ;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }
    public static void doNestedLoop2()
    {
        /*
         * 1 234
         * 123
         * 12
         * 1
         */
        for(int i=4; i>=1     ;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
    public static void doNestedLoop3(int n)
    {
        /*
         * 4444
         * 333
         * 22
         * 1
         */
        for(int i=n; i>=1     ;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
        public static void doNestedLoop3B(int n)
    {
        /*
         * 1       
         * 22
         * 333
         * 4444
         * 55555
         * nnnnnn...
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 123456....
         */
        for(int i=1; i<=n ;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void fxjj0()
    {
         for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print("#");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void fxjj()
    {
         for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print("#");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void doNestedLoop5(int n)
    {
        /*
         * *****
         * ****
         * ***
         * **
         * *
         * 123456
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */
        for(int j=n;j>=1;j--)
        {
            for(int i=1; i<=j; i++)
            { 
                System.out.print("*");
            }       
            System.out.println();
        }
    }
         
    
    
        
}
