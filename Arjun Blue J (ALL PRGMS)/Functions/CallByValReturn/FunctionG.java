package Functions.CallByValReturn;
public class FunctionG
{
    public static void main(int n)
    {
        System.out.println(palindrome(n));
    }
    public static int palindrome (int n)
    {
        int s=0,m=n;
        do
        {
            int d=n%10;
            n=n/10;
            s=(s*10)+d;
        }while(n!=0);
        if(s==m)
        {
            return 1;
        }    
        else
        {
            return 0;
        }
    }
}