package Modulus_Std;
public class ModO
{
    public static void main(int n)
    {
        int sq=n*n;int cop=n;int nod=0;
        
        do
        {
            int d =n%10;
            n=n/10;
            nod++;
        }while(n!=0);
        int partsq=sq%(int)Math.pow(10,nod);
        
        if(partsq==cop)
        {
            System.out.println("Automorphic");
        }
        else
        {
            System.out.println(" NOT Automorphic");
        }
    }
}
