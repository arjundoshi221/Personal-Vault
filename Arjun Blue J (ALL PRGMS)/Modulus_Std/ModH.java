package Modulus_Std;
public class ModH
{
    public static void main(int a , int b)
    {
        int c =0;
        int hcf=0;
        
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                c++;
                hcf=i;
            }
        }
        int lcm = a*b/hcf;
        System.out.println(lcm);
    }
}   