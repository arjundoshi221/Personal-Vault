package Loop.Patterns;
public class Pat5
{
    public static void main(int n)
    {
        int sp=n-1;
        for(int i=n;i>0;i--)
        {
            for(int k=0;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            sp--;
        }
    }    
}



