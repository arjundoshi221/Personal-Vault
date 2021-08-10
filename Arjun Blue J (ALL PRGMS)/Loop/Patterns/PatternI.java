package Loop.Patterns;
public class PatternI
{
    public static void main(int n)
    {   
        int sp = n-1;
         for(int i= 1; i<=n; i++)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
            sp--;
        }
    }
}

