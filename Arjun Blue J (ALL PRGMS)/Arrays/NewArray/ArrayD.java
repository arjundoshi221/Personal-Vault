package Arrays.NewArray;
public class ArrayD
{
    public static void main()
    {
        int n[]={-4,5,-6,2,4,-10,-8,9,-1};
        int sumPos=0,sumNeg=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>0)
            {
                sumPos=sumPos+n[i];
            }
            if(n[i]<0)
            {
                sumNeg=sumNeg+n[i];
            }
        }
        System.out.println("Positive sum = "+ sumPos);
    }
}
