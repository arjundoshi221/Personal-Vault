package Arrays.NewArray;
public class ArrayG
{
    public static void main()
    {
        int n[]={7,3,5,6,2,9,22,4,55,66,22,11};
        int avgEven = 0, avgOdd=0, cEven=0,cOdd=0,Odd=0,Even=0;
        
        for(int i=0;i<n.length;i++)
        {
            if(n[i]%2==0)
            {
                cEven++;
                Even=Even+n[i];
            }
            if(n[i]%2!=0)
            {
                cOdd++;
                Odd=Odd+n[i];
            }
        }
        avgEven=Even/cEven;
        avgOdd=Odd/cOdd;
        
        System.out.println("Even Averge: "+avgEven);
        System.out.println("Odd Average: "+avgOdd);
    }
}
