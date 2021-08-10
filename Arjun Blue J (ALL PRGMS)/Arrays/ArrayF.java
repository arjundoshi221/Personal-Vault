package Arrays;
public class ArrayF
{
    public static void main()
    {
        int n[]={2,-4,-6,7,9,-6,5,6,-9};
        int cPos=0;
        int cNeg=0;
        for(int  i=0;i<n.length;i++)
        {
            if(n[i]>=0)
            {
                cPos++;
            }
            if(n[i]<0)
            {
                cNeg++;
            }
        }
        System.out.println("Frequency of +ve nos ="+cPos);
        System.out.println("Frequency of -ve nos ="+cNeg);
    }
}