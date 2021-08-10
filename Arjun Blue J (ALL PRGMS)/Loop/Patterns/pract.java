package Loop.Patterns;
public class pract
{
    public static void main(int n)
    {
        int pos=1,sp=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(pos+" ");
                pos++;
            }
            System.out.println();
            sp--;
        }
    }
    
    public static void main2(int n)
    {
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("a ");
                }
                else
                {
                    System.out.print("l ");
                }
            }
            System.out.println();
        }
    }
    
    public static void T(int n)
    {
        int c=1;
        
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("a ");
                }
                
            }
            else
            {
                
                for(int j=0;j<=i;j++)
                {
                    System.out.print(c+" ");
                    c++;
                }
                
            }
            System.out.println();
        }
        
    }
}
