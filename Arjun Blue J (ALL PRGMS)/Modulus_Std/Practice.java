package Modulus_Std;
import java.util.*;
public class Practice
{
    public static void main(int n)
    {
        int m=n;
        int s=0;
        do
        {
            int d=n%10;
            s=s+d*d*d;
            n=n/10;
        }while(n!=0);
        
        if(m==s)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
    /**
     * Krishnamurty No.
     * 145==> 1!+4!+5!=1+24+120 = 145
     */
    public static void KM(int n)
    {
        int m=n;int s=0;
        do
        {
            int d=n%10;
            n=n/10;
            int f=1;
            for(int i=1;i<=d;i++)
            {
                f=f*i;
            }
            s=s+f;
        }while(n!=0);
        
        if(s==m)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
    public static void Auto(int n)
    {
        int m=n;int nod=0;int sq=n*n;
        do
        {
            int d=n%10;
            nod++;
            n=n/10;
        }while(n!=0);
        
        int partSq = sq% (int)Math.pow(10,nod);
        
        if(partSq==m)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
    public static void binaryToDec(int dec)
    {
        int m=0;int pos=0;
        int n[]=new int[20];
        
        
        do
        {
            int d=dec%10;
            n[pos]=d;
            pos++;
            dec=dec/10;
        }while(dec!=0);
        
        for(int i=0;i<pos;i++)
        {
            m=m+n[i]*(int)Math.pow(2,i);
        }
        
        System.out.println(m);
    }
    
    public static void DecToBinary(int n)
    {
        int m[]=new int[20];
        int pos=0;
        do
        {
            int d=n%2;
            m[pos]=d;
            pos++;
            n=n/2;         
        }while(n!=0);
        
        for(int i=pos-1;i>=0;i--)
        {
            System.out.print(m[i]);
        }
    }
    
    public static void BinaryIntTo()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter binary code: ");
        int n = sc.nextInt();
        int m[]=new int[10];
        int pos=0;
        int s=0;
        
        do
        {
            m[pos++]=n%10;
            n=n/10;
        }while(n!=0);
        
        for(int i=0;i<pos;i++)
        {
            s = s + m[i]*(int)Math.pow(2,i);
        }
        
        System.out.println("Number: "+s);
    }
    
    public static void DecToBin()
    {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int m[]=new int[10];
        int pos=0;
        
        
        do
        {
            m[pos++]=n%2;
            n=n/2;
        }while(n!=0);
        System.out.println("Binary code: ");
        for(int i=pos-1;i>=0;i--)
        {
            System.out.print(m[i]);
        }
    }
}
