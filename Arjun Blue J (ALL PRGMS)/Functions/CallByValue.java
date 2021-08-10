package Functions;
/**
 * Write a description of class FunctionCall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallByValue
{
    /**
     * Krishnamurty No.
     * 145==> 1!+4!+5!=1+24+120 = 145
     */
    public static boolean doKM(int n)
    {
        int m=n,s=0;
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
            return true;
        }
        else
        {
            return false;
        }
    }
    
     /**
     * Armstrong No.
     * 153 = 3^3 + 5^3 +1^3 = 153 ==>27+125+1
     */
    public static boolean doArmstrong(int n)//impure
    {
        int m=n,s=0;//153
        do
        {
            int d=n%10;//3
            s=s+d*d*d;//27+x
            n=n/10;//15
        }while(n!=0);
        if(s==m)
        {           
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * 5!=1*2*3*4*5 = 120
     * 4!=1*2*3*4=24
     */
    public static void factorial(int n)//pure
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial = "+f);
    }
    public static void main(int x)
    {
        System.out.println("Before func call : x = "+x);
        boolean ans=doArmstrong(x);
        System.out.println("After func call : x = "+x);
        if(ans==true)
        {
            System.out.println("AN");
        }
        else
        {
            System.out.println("!AN");
        }
        factorial(5);
    }
  }

