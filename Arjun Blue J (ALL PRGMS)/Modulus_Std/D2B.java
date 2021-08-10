package Modulus_Std;
public class D2B
{
    public static void doConvertD2B(int m)
    {
        int n[]=new int [10];
        int pos=0;
        do
        {
            n[pos]= m%2;
            pos++;
            m=m/2;
        }while(m!=0);
        
        for(int i=pos-1;i>=0;i--)
        {
            System.out.print(n[i]);
        }
    }
    public static void doConvertB2D(int n[])
    {
        int m=0;
        for(int i=0;i<n.length;i++)
        {
            m=m+n[i]*(int)Math.pow(2,i);
        }
        System.out.print(m);
        
    }    
    public static void doConvertB2DNew(int dec)
    {
        int m=0;
        int n[]=new int [20];
        int pos=0;
        do
        {
            n[pos]=dec%10;
            //n[pos++]=dec%10;
            pos++;
            dec=dec/10;
        }while(dec!=0);
        
        for(int i=0;i<pos;i++)
        {
            m=m+n[i]*(int)Math.pow(2,i);
        }
        System.out.print(m);
        
    }
}
