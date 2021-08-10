package Loop.RegularIteration;
public class Nl2
{
public static void doNestedLoop5(int n)
    {
        /*
         * * * * * *
         *  * * * *
         *   * * *
         *    * *
         *     *
         * 1 2 3 4 5 6
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */
        int sp=0;
        for(int j=n;j>=1;j--)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int i=1; i<=j; i++)
            { 
                System.out.print("* ");
            }       
            System.out.println();
            sp++;
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
        int sp = 0;
        for(int i=n ;i>=1; i--)
        {   
            for(int k=1;k<=sp;k=k+1)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            sp=sp+1;
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
         int sp=n-1;
        for(int i=1; i<=n ;i++)
        {
            for(int k=1;k<=sp;k=k+1)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
            sp--;
        }
    }
}
