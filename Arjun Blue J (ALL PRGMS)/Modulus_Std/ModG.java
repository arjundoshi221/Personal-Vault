package Modulus_Std;
public class ModG
{
    public static void main(int a,int b)
    {
        int c =0;
        int hcf=0;;
        for (int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                c++;
                hcf=i;
            }
        }
        System.out.println("HCF = "+ hcf);
    }
}
