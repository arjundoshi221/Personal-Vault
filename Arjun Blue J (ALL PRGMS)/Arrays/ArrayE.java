package Arrays;
public class ArrayE
{
    public static void main()
    {
        int n[]={-14,15,-16,12,14,10,-18,19,-11};
        int sum=0;
        int prod=1;
        
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>=0)
            {
                sum=sum+n[i];
            }
            else if(n[i]<0)
            {
                prod=prod*n[i];
            }
        }
        System.out.println("Sum of positive ="+ sum);
        System.out.println("Product of negative ="+ prod);
    }
}
