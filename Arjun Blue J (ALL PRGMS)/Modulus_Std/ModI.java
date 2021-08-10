package Modulus_Std;
public class ModI
{
    public static void main(int a , int b,int c)
    {
        int d =0;
        int hcf=0;
        
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0 && c%i==0)
            {
                d++;
                hcf=i;
            }
        }
        int lcm = a*b*c/hcf;
        System.out.println(lcm);
    }
}
