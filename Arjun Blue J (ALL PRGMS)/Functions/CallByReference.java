package Functions;
public class CallByReference
{
    public static void sort(int m[])
    {
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m.length-1-i;j++)
            {
                if(m[j]>m[j+1])
                {
                    int c=m[j];
                    m[j]=m[j+1];
                    m[j+1]=c;
                }
            }
        }
    } 
    public static void doTest(int x[])
    {
        System.out.println("Before sort:");
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
        sort(x);
        System.out.println("After sort:");
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }
}
