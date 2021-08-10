package Arrays.NewArray;
public class ArrayI
{
    public static void main()
    {
        int n[]={45,76,87,34,65,23,98,54,55,10,77,44};
        
        for(int i=0;i<n.length;i++)//selected term
        {
            for(int j=i+1;j<n.length;j++)//whole loop
            {
                if(n[i]<n[j])
                {
                    int c=n[i];
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
