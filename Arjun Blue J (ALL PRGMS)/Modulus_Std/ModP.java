package Modulus_Std;
public class ModP
{
    public static void main(int n)
    {
        int m=n; int s=0;
        
        do
        {
            int d=n%10;
            n=n/10;
            int f=1;
            for(int i=1;i<=d;i++)
            {
                f=f*i;
            }
            s=s+f;
        }while(n!=0);
        if(s==m)
        {
            System.out.println("Special");
        }
        else
        {
            System.out.println("NOT Special");
        }
    }
}
