package Modulus_Std;
public class ModR
{
    public static void main(int m)
    {
        int n[]=new int [10];
        int pos=0;
        int nm=m;
        while(m!=0)
        {
            n[pos]=m%2;
            pos++;
            m=m/2;
        }
        
        for(int i=pos-1;i>=0;i--)
        {
            System.out.print(n[i]);
        }
    }
}
    