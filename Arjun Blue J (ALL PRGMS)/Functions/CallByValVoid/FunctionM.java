package Functions.CallByValVoid;
public class FunctionM
{
    public static void main()
    {
        for(int i=1;i<=1000;i++)
        {
            automorphic(i);
        }
    }
    public static void automorphic(int n)
    {
        int sq=n*n;int nod=0;int m=n;
        do
        {
            int d=n%10;
            n=n/10;
            nod++;
        }while(n!=0);
        
        int partsq=sq%(int)Math.pow(10,nod);//explicit casting
        
        if(partsq==m)
        {
            System.out.println(m);
        }
    }
}
