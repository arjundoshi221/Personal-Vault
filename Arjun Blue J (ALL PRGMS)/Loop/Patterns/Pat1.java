package Loop.Patterns;
public class Pat1
{
    public static void main(int n)
    {
        int sp=n-1;
        for(int i=0;i<=n;i++)
        {
            for(int k=0;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            sp--;
        }
    }    
}
