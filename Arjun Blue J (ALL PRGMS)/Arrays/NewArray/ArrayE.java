package Arrays.NewArray;
public class ArrayE
{
    public static void main()
    {
        int n[]={-14,15,-16,12,10,-18,19,-11};
        int pos=0; int neg=1;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>0)
            {
                pos=pos+n[i];
            }
            if(n[i]<0)
            {
                neg=neg*n[i];
            }
        }
    }
}
