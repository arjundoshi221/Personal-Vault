package Arrays.NewArray;
public class ArrayK
{
    public static void main()
    {
        int r[]={1,2,3,4,5};
        int m[]={65,58,89,42,76};
        
        for(int i=0;i<m.length;i++)
        {
            for(int j=i+1;j<m.length;j++)
            {
                if(m[i]<m[j])
                {
                    int c=m[i];
                    m[i]=m[j];
                    m[j]=c;
                    
                    int a=r[i];
                    r[i]=r[j];
                    r[j]=a;
                }
            }
        }
        System.out.println("Marks\t\tRoll.No.");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]+"\t\t"+r[i]);
        }
        
    }
}
