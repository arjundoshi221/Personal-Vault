package Loop.Patterns;
public class PatternL
{
    public static void main(int n)
    {
        int sp = 0;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            sp++;
        }
    }
}
