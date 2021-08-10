package Modulus_Std;
public class ModS
{
    public static void main(int n[])
    {
        int m=0;
        for(int i=0;i<n.length;i++)
        {
            m=m+ n[i]*(int)Math.pow(2,i);
        }
        System.out.println(m);
    }
}
