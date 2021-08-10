package Modulus_Std;
public class ModK
{
    public static void main(int n)
    {
        int odd=0;int even=1;
        do
        {
            int d=n%10;
            n=n/10;
            if(d%2==0)
            {
                even=even*d;
            }
            else
            {
                odd=odd+d;
            }
        }while(n!=0);
        System.out.print("Odd="+odd);
        System.out.print("Even="+even);
    }
}
