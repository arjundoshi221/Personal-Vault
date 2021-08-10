package Modulus_Std;
public class ModF
{
    public static void main(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println("Perfect");
        }
        else
        {
            System.out.println(" NOT Perfect");
        }
    }
}
