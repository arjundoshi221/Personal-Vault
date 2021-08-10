package Modulus_Std;
public class ModD
{
    public static void main(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
