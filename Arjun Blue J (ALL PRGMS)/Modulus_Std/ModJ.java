package Modulus_Std;
public class ModJ
{
    public static void main(int n)
    {
        int s=0; 
        do
        {
            int d=n%10;
            n=n/10;
            s=s+d;
        }while(n!=0);
        System.out.println(s);
    }    
}
