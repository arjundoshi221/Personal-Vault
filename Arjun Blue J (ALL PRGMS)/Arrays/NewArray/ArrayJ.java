package Arrays.NewArray;
public class ArrayJ
{
    public static void main()
    {
        int n[]={3,5,12,16,9,45,55,60,72,24};
        
        for(int i=0;i<=4;i++)//range+selected term
        {
            for(int j=i+1;j<=4;j++)//whole loop
            {
                if(n[i]>n[j])
                {
                    int c = n[i];
                    n[i]=n[j];
                    n[j]=c;
                }
            }
        }
        
        for(int i=5;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]<n[j])
                {
                    int c = n[i];
                    n[i]=n[j];
                    n[j]=c;
                }
            }
        }
        
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
}
