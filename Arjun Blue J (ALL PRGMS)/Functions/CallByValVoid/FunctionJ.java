package Functions.CallByValVoid;
public class FunctionJ
{
    public static void main()
    {
        for(int i=1;i<=1000;i++)
        {
            palindrome(i);
        }
        
    }
    public static void palindrome(int n)
    {
        int m=n;int s=0;
        do
        {
            int d=n%10;
            n=n/10;
            s=(s*10)+d;
        }while(n!=0);
        if(s==m)
        {
            System.out.println(s);
        }
    }
}
