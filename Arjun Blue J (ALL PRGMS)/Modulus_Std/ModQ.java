package Modulus_Std;
public class ModQ
{
    public static void main(int a,int b)
    {
        int hcf=0;
        for(int i =1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        int GCD=a*b/hcf;
        System.out.println(GCD);
    }
}
