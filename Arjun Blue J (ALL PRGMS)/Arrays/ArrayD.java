package Arrays;
public class ArrayD
{
    public static void main()
    {
        int n[]={-4,5,-6,2,4,-10,-8,9,-1};
        int sum=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>0)
            {
                sum=sum+n[i];
            }
        }
        System.out.println("Sum = "+sum);
    }
}
