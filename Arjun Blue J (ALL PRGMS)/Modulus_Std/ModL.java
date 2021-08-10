package Modulus_Std;
public class ModL
{
    public static void main(int n)
    {
        int m=n;int sum=0;
        do
        {
            int d = n%10;
            n=n/10;
            sum=sum+d*d*d;
        }while(n!=0);
        if(sum==m)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("NOT Armstrong");
        }
    }
}
