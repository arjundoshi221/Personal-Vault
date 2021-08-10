package String1;

public class StringNestedLoop
{
    public static void doNestedLoopSubstring(String s)
    {
        /**
         * RAMAN
         * AMAN
         * MAN
         * AN
         * N
         */
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            System.out.println(s.substring(i));
        }
    }
    public static void doNestedLoopSubstring2(String s)
    {
        /**
         * R
         * RA
         * RAM
         * RAMA
         * RAMAN
         */
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            System.out.println(s.substring(0,i+1));
        }
    }
    public static void doNestedLoop(String s)
    {
        int n=s.length();
        /*
         * 1
         * 12
         * 123
         * 1234
         * :
         * 0
         * 01
         * 012
         * 0123
         * 01234
         * 
         * RAMAN
         * 
         * R
         * RA
         * RAM
         * RAMA
         * RAMAN
         */
        for(int i=0; i<n     ;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
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
