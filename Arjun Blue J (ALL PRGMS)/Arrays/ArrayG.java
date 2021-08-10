package Arrays;
public class ArrayG
{
    public static void main()
    {
        int n[]={7,3,5,6,2,9,22,4,55,66,22,11};
        double oddSum=0,oddC=0,oddAvg,evenSum=0,evenC=0,evenAvg;
        
        for(int i=0;i<n.length;i++)
        {
            if(n[i]%2==0)
            {
                evenSum=evenSum+n[i];
                //evenSum+=n[i];
                evenC++;
            }
            if(n[i]%2==1)
            {
                oddSum= oddSum+n[i];
                //oddSum+=n[i];
                oddC++;                
            }
        }
        evenAvg=evenSum/evenC;
            oddAvg=oddSum/oddC;
            System.out.println("Even Average = "+evenAvg);
            System.out.println("Odd Average = "+oddAvg);
    }
}
