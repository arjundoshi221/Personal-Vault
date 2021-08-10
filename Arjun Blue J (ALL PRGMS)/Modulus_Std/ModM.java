package Modulus_Std;
public class ModM
{
    public static void main(int n)
    {
        int m=n*n; int s=0;int copy=n;
        do
        {
            int d =m%10;
            m=m/10;
            s=s+d;
        }while(m!=0);
        if(s==copy)
        {
            System.out.println("Neon");
        }
        else
        {
            System.out.println("NOT Neon");
        }
        
    }
}
